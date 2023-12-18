import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		long[] heap = new long[H];
		for (int i = 0; i < heap.length; i ++) {
			heap[i] = scanner.nextLong();
		}
		
		scanner.close();
		
		buildMaxHeap(heap);
		
		for (int i = 0; i < heap.length; i ++) {
			System.out.print(" ");
			System.out.print(heap[i]);
		}
		System.out.println();
	}

	static int parent(int i) {
		return (i  - 1) / 2;
	}

	static int left(int i) {
		return i * 2 + 1;
	}

	static int right(int i) {
		return left(i) + 1;
	}
	
	static void maxheapify(long[] heap, int i) {
		int l = left(i);
		int r = right(i);
		int max = i;
		
		if (l < heap.length && heap[l] > heap[max]) {
			max = l;
		}
		if (r < heap.length && heap[r] > heap[max]) {
			max = r;
		}
		
		if (max != i) {
			long temp = heap[i];
			heap[i] = heap[max];
			heap[max] = temp;
			
			maxheapify(heap, max);
		}
	}
	
	static void buildMaxHeap(long[] heap) {
		for (int i = heap.length / 2 - 1; i >= 0; i --) {
			maxheapify(heap, i);
		}
	}
} 

