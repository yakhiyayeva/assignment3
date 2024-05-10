import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Example data
        int[] data = {16, 19, 14, 37, 13, 8, 18, 5, 25, 30};

        // Sorting using QuickSort
        quick quickSort = new quick();
        int[] quickSorted = Arrays.copyOf(data, data.length);
        quickSort.sort(quickSorted);
        System.out.println("QuickSort: " + Arrays.toString(quickSorted));

        // Sorting using MergeSort
        merge mergeSort = new merge();
        int[] mergeSorted = Arrays.copyOf(data, data.length);
        mergeSort.sort(mergeSorted);
        System.out.println("MergeSort: " + Arrays.toString(mergeSorted));

        // Sorting using HeapSort
        heap heapSort = new heap();
        int[] heapSorted = Arrays.copyOf(data, data.length);
        heapSort.sort(heapSorted);
        System.out.println("HeapSort: " + Arrays.toString(heapSorted));

        // Sorting using InsertionSort
        insertion insertionSort = new insertion();
        int[] insertionSorted = Arrays.copyOf(data, data.length);
        insertionSort.sort(insertionSorted);
        System.out.println("InsertionSort: " + Arrays.toString(insertionSorted));

        // Sorting using SelectionSort
        selection selectionSort = new selection();
        int[] selectionSorted = Arrays.copyOf(data, data.length);
        selectionSort.sort(selectionSorted);
        System.out.println("SelectionSort: " + Arrays.toString(selectionSorted));
    }
}

