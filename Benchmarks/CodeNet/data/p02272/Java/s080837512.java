import java.util.Scanner;

public class Main {
	public static int Merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] l = new int[n1 + 1];
		int[] r = new int[n2 + 1];
		for(int i = 0; i < n1; i++) {
			l[i] = arr[left + i];
		}
		l[n1] = Integer.MAX_VALUE;
		for(int i = 0; i < n2; i++) {
			r[i] = arr[mid + i];
		}
		r[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for(int k = left; k < right; k++) {
			if(l[i] <= r[j]) {
				arr[k] = l[i];
				i++;
			} else {
				arr[k] = r[j];
				j++;
			}
		}
		return right - left;
	}
	public static int MergeSort(int[] arr, int left, int right) {
		int count = 0;
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			int a = MergeSort(arr, left, mid);
			int b = MergeSort(arr, mid, right);
			int c = Merge(arr, left, mid, right);
			count = a + b + c;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = MergeSort(arr, 0, n);
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(count);
	}
}

