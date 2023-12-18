import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.parallelSort(arr);
		int q = scn.nextInt();
		while (q-- > 0) {
			int b = scn.nextInt();
			int c = scn.nextInt();
			Replace(b, c);
			long sum = Val();
			System.out.println(sum);
		}

	}

	public static void Replace(int b, int c) {
		int n = arr.length;
		int idx = Integer.MAX_VALUE;
		while (true) {
			idx = binarySearch(0, n - 1, b);
			if (idx == -1) {
				break;
			} else {
				arr[idx] = c;
			}
		}
	}

	public static int binarySearch(int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(l, mid - 1, x);
			return binarySearch(mid + 1, r, x);
		}
		return -1;
	}

	public static long Val() {
		int n = arr.length;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static long sum() {
		int length = arr.length - 1;
		int half = length / 2;
		long sum = 0;
		for (int i = 0; i <= half; i++) {
			sum += arr[i] + arr[length - i];
		}
		return sum;
	}

}
