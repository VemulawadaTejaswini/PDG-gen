import java.util.*;

public class Main {
	static int read;
	static long[] heap;

	public static void maxHeapify(int i) {
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		int largest;
		
		if (left < read && heap[left] > heap[i]) {
			largest = left;
		} else {
			largest = i;
		}
		if (right < read && heap[right] > heap[largest]) {
			largest = right;
		}

		if (largest != i) {
			long tmp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = tmp;
			maxHeapify(largest);
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		read = in.nextInt();
		heap = new long[read];
		for (int i = 0; i < read; i++) {
			heap[i] = in.nextLong();
		}
		for (int i = read / 2; i >= 0; i--) {
			maxHeapify(i);
		}
		for (int i = 0; i < read; i++) {
			System.out.print(" " + heap[i]);
		}
		System.out.println("");
		in.close();
	}
}
