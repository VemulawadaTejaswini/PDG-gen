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
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
			arr2[i] = arr[i];
		}
		countInversion(arr);
		System.out.println(count);
	}

	private static void countInversion(int[] arr) {
		countInversion(arr, 0, arr.length);
	}

	private static void countInversion(int[] arr, int left, int right) {
		if (left + 1 < right) {
			int mid = left + (right - left) / 2;
			countInversion(arr, left, mid);
			countInversion(arr, mid, right);
			merge(arr, left, mid, right);
		}
	}
 
	private static void merge(int[] arr, int left, int mid, int right) {
		
		int n1 = mid - left;
		int n2 = right - mid;
		
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = arr[mid + i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		int tmp = n1;		
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				if (R[j] != Integer.MAX_VALUE) {
					tmp--;
				}				
				arr[k] = L[i];
				i++;
			} else {
				if (L[i] != Integer.MAX_VALUE) {
					count += tmp;
				}
				arr[k] = R[j];
				j++;
			}
		}
	}
}

