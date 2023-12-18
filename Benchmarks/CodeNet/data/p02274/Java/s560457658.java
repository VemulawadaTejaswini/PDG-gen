import java.util.Scanner;



public class Main {
	static int count;

	public static void merge(int[] arr, int right, int mid, int left) {
		int n1 = mid - left, n2 = right - mid;
		int[] l = new int[n1 + 1], r = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			l[i] = arr[left + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = arr[mid + i];
		}
		l[n1] = Integer.MAX_VALUE;
		r[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			if (l[i] <= r[j]) {
				arr[k] = l[i++];
			} else {
				arr[k] = r[j++];
				count += n1 - i;
			}
		}
	}
	public static void mergeSort(int[] arr, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid, right);
			merge(arr, right, mid, left);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0, n);
		System.out.println(count);
	}
}
