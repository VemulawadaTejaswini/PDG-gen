import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		quickSort(arr, 0, N - 1);
		int q = scn.nextInt();
		while (q-- > 0) {
			int b = scn.nextInt();
			int c = scn.nextInt();
			Replace(arr, b, c);
			long sum = Val(arr);
			System.out.println(sum);
		}

	}

	public static void Replace(int[] arr, int b, int c) {
		int n = arr.length;
		int idx = Integer.MAX_VALUE;
		while (true) {
			idx = binarySearch(arr, 0, n - 1, b);
			if (idx == -1) {
				break;
			} else {
				arr[idx] = c;
				quickSort(arr, 0, n - 1);
			}
		}
	}

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;

		int pivot = arr[mid];

		// partitioning
		int left = lo;
		int right = hi;

		while (left <= right) {

			// move left to a problem
			while (arr[left] < pivot) {
				left++;
			}

			// move right to a problem
			while (arr[right] > pivot) {
				right--;
			}

			// problem solve : swap
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}

		// smaller problems
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}

	public static long Val(int[] arr) {
		int n = arr.length;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static long sum(int[] s) {
		int length = s.length - 1;
		int half = length / 2;
		long sum = 0;
		for (int i = 0; i <= half; i++) {
			sum += s[i] + s[length - i];
		}
		return sum;
	}

}
