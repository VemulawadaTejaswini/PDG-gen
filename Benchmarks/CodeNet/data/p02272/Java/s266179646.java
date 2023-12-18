import java.util.Scanner;

public class Main {

	public static int cnt;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		mergeSort(A, 0, n);

		for (int i = 0; i < n - 1; i++) {
			System.out.print(A[i]);
			System.out.print(" ");
		}
		System.out.println(A[n - 1]);
		System.out.println(cnt);

	}

	public static void marge(int[] A, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;

		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}

		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			cnt++;
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}

		}
	}

	public static void mergeSort(int[] A, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			marge(A, left, mid, right);
		}
	}

}