import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(strArray[i]);
		mergeSort(arr, 0, arr.length);
		System.out.println(count);
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if (left + 1 < right) {
			int mid = left + (right - left) / 2;
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
		for (int i = 0; i < n1; i++) L[i] = arr[left + i];
		for (int i = 0; i < n2; i++) R[i] = arr[mid + i];
		L[n1] = R[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				if (i < n1) {
					count += n1 - i;
				}
				arr[k] = R[j];
				j++;
			}
		}
	}
}

