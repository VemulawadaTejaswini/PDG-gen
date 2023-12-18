
// counting sort

import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = 0;
		int[] A = new int[n];
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
			if (A[i] > k) {
				k = A[i];
			}
		}
		countingSort(A, B, k, n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(B[i]).append((i != n - 1) ? " " : "\n");
		}
		System.out.print(sb);
	}
	public static void countingSort(int[] A, int[] B, int k, int n) {
		int[] C = new int[k + 1];
		for (int i = 0; i < n; i++) {
			C[A[i]]++;
		}
		for (int i = 1; i < k + 1; i++) {
			C[i] += C[i - 1];
		}
		for (int i = n - 1; i >= 0; i--) {
			B[--C[A[i]]] = A[i];
		}
	}	
}