import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		char[] S = new char[n];
		int[] A = new int[n];
		
		for (int i = 0; i < n; i ++) {
			S[i] = scanner.next().charAt(0);
			A[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		char[] T = S.clone();
		int[] B = A.clone();
		
		quickSort(S, A, 0, n - 1);
		mergeSort(T, B, 0, n);
		
		if(Arrays.equals(A, B) && Arrays.equals(S, T)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		
		for (int i = 0; i < n; i ++) {
			System.out.println(S[i] + " " + A[i]);
		}
	}
	
	public static int partition (char[] S, int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i ++;
				char tempc = S[i];
				S[i] = S[j];
				S[j] = tempc;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}

		char tempc = S[++ i];
		int temp = A[i];
		S[i] = S[r];
		A[i] = A[r];
		S[r] = tempc;
		A[r] = temp;

		return i;
	}

	public static void quickSort(char[] S, int[] A, int p, int r) {
		if (p < r) {
			int q = partition(S, A, p, r);
			quickSort(S, A, p, q - 1);
			quickSort(S, A, q + 1, r);
		}
	}

	public static int merge(char[] T, int[] A, int left, int mid, int right) {
		int count = 0;

		int n1 = mid - left;
		int n2 = right - mid;

		int[] L = new int[n1 + 1];
		char[] LT = new char[n1];
		int[] R = new int[n2 + 1];
		char[] RT = new char[n2];

		System.arraycopy(A, left, L, 0, n1);
		L[n1] = Integer.MAX_VALUE;
		System.arraycopy(T, left, LT, 0, n1);
		System.arraycopy(A, mid, R, 0, n2);
		R[n2] = Integer.MAX_VALUE;
		System.arraycopy(T, mid, RT, 0, n2);

		int i = 0;
		int j = 0;

		for (int k = left; k < right; k ++) {
			count ++;
			if (L[i] <= R[j]) {
				A[k] = L[i];
				T[k] = LT[i];
				i ++;
			} else {
				A[k] = R[j];
				T[k] = RT[j];
				j ++;
			}
		}

		return count;
	}

	public static int mergeSort(char[] T, int[] A, int left, int right) {
		int count = 0;

		if (left + 1 < right) {
			int mid = (left + right) / 2;
			count += mergeSort(T, A, left, mid);
			count += mergeSort(T, A, mid, right);
			count += merge(T, A, left, mid, right);
		}

		return count;
	}
} 

