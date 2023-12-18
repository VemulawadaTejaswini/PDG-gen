import java.util.Scanner;

public class Main {

	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[n];
		for(int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		sc.close();

		mergeSort(S, n, 0, n);
		for(int i = 0; i < n; i++) {
			if(i != S.length - 1) {
				System.out.print(S[i] + " ");
			}else {
				System.out.print(S[i]);
			}
		}
		System.out.println();
		System.out.println(count);

	}

	public static void merge(int[] A, int n, int left, int mid, int right) {
		int n1 = mid -left;
		int n2 = right - mid;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for(int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for(int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}
		L[n1] = R[n2] = Integer.MAX_VALUE;
		int x = 0;
		int y = 0;
		for(int k = left; k < right; k++) {
			count++;
			if(L[x] <= R[y]) {
				A[k] = L[x++];
			}else {
				A[k] = R[y++];
			}
		}
	}
	public static void mergeSort(int[] A, int n, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(A, n, left, mid);
			mergeSort(A, n, mid, right);
			merge(A, n, left, mid, right);
		}
	}

}

