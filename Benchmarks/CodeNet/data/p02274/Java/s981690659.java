
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String a[] = br.readLine().split(" ");
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(a[i]);
		}
		count = 0;
		margeSort(A, 0, n);
		System.out.println(count);
	}
	public static void marge(int[] A, int left, int middle, int right) {
		int n1 = middle - left;
		int n2 = right - middle;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[middle + i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
				count += j;
			} else {
				A[k] = R[j];
				j++;
			}
		}
	}
	public static void margeSort(int[] A, int left, int right) {
		if ((left + 1) < right) {
			int middle = (left + right) / 2;
			margeSort(A, left, middle);
			margeSort(A, middle, right);
			marge(A, left, middle, right);
		}
	}
	public static int count;
}