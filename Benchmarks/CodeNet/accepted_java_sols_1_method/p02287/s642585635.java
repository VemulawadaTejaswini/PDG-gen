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
		
		for (int i = 0; i < heap.length; i ++) {
			System.out.print("node ");
			System.out.print(i + 1);
			System.out.print(": key = ");
			System.out.print(heap[i]);
			System.out.print(", ");
			if (i != 0) {
				System.out.print("parent key = ");
				System.out.print(heap[(i  - 1) / 2]);
				System.out.print(", ");
			}
			int left = i * 2 + 1;
			if (left < heap.length) {
				System.out.print("left key = ");
				System.out.print(heap[left]);
				System.out.print(", ");
			}
			int right = left + 1;
			if (right < heap.length) {
				System.out.print("right key = ");
				System.out.print(heap[right]);
				System.out.print(", ");
			}
			System.out.println();
		}
	}
} 

