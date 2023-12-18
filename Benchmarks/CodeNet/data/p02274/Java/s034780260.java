import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] S = new int[n];

		for (int i = 0; i < n; i ++) {
			S[i] = scanner.nextInt();
		}

		scanner.close();

		long count = mergeSort(S, 0, n);

		System.out.println(count);
	}

	public static long merge(int[] A, int left, int mid, int right) {
		long count = 0;

		int n1 = mid - left;
		int n2 = right - mid;

		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		System.arraycopy(A, left, L, 0, n1);
		L[n1] = Integer.MAX_VALUE;
		System.arraycopy(A, mid, R, 0, n2);
		R[n2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;

		for (int k = left; k < right; k ++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i ++;
			} else {
				count += n1 - i;
				A[k] = R[j];
				j ++;
			}
		}

		return count;
	}

	public static long mergeSort(int[] A, int left, int right) {
		long count = 0;

		if (left + 1 < right) {
			int mid = (left + right) / 2;
			count += mergeSort(A, left, mid);
			count += mergeSort(A, mid, right);
			count += merge(A, left, mid, right);
		}

		return count;
	}
} 

