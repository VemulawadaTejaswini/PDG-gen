import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		
		mergeSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
		System.out.println(count);
	}

	/*
	private static void mergeSort(int[] arr) {
		mergeSort(arr, 0, arr.length);
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
		
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		for (int i = 0; i <= n1 - 1; i++) {
			L[i] = arr[left + i];
		}
		for (int i = 0; i <= n2 - 1; i++) {
			R[i] = arr[mid + i];
		}
		
		L[n1] = -1;
		R[n2] = -1;
		
		int i = 0;
		int j = 0;
		for (int k = left; k <= right - 1; k++) {
			count++;
			if (R[j] == -1 || (L[i] != -1 && L[i] <= R[j])) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
		}
	}
	*/

	private static void mergeSort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int floor, int ceiling) {		
		if (floor < ceiling) {
			int mid = floor + (ceiling - floor) / 2;
			mergeSort(arr, floor, mid);
			mergeSort(arr, mid + 1, ceiling);
			merge(arr, floor, mid, ceiling);
		}
	}

	private static void merge(int[] arr, int floor, int mid, int ceiling) {

		int n1 = mid - floor + 1;
		int n2 = ceiling - mid;
		
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[floor + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = arr[mid + 1 + i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		for (int k = floor; k <= ceiling; k++) {
			count++;
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
		}
	}
}

