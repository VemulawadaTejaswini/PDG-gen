import java.util.Scanner;
import java.util.StringJoiner;

class Main {

	static int count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] s = new int[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		sc.close();

		mergeSort(s, 0, n);

		StringJoiner sj = new StringJoiner(" ");
		for (int i = 0; i < n; i++) {
			sj.add(String.valueOf(s[i]));
		}

		System.out.println(sj.toString());
		System.out.println(count);

	}

	private static void mergeSort(int[] arr, int left, int right) {

		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid, right);
			merge(arr, left, mid, right);
		}

	}

	private static void merge(int[] arr, int left, int mid, int right) {

		int n1 = mid - left;
		int n2 = right - mid;

		int[] L = new int[n1+1];
		int[] R = new int[n2+1];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[left+i];
		}

		for (int i = 0; i < n2; i++) {
			R[i] = arr[mid+i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;

		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}

			count++;

		}
	}
}