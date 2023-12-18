import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] heap = new int[n];
        for (int i = 0; i < n; i++) {
            heap[i] = in.nextInt();
        }
        buildMaxHeap(heap);
        for (int i : heap) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    private static void buildMaxHeap(int[] heap) {
        for (int i = heap.length / 2; i > 0; i--) {
            maxHeapify(heap, i);
        }
    }

    private static void maxHeapify(int[] heap, int i) {
        int left = i*2-1;
        if (left < heap.length) {
            int right = i * 2;
            int maxChild = left;
            if (right < heap.length && heap[right] > heap[left]) {
                maxChild = right;
            }

            if (heap[maxChild] > heap[i - 1]) {
                int temp = heap[maxChild];
                heap[maxChild] = heap[i - 1];
                heap[i - 1] = temp;
                maxHeapify(heap, maxChild+1);
            }
        }
    }
}

