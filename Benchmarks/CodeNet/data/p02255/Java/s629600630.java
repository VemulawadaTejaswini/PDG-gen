import java.io.IOException;
import java.util.Scanner;

/**
 * 挿入ソート
 * 
 *
 */

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		printArray(arr);
		insertionSort(arr, n);
	}
	
	public static void insertionSort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int v = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j] > v) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = v;
			printArray(arr);
		}
	}
	
	public static void printArray(int[] arr) {
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i] + " ";
		}
		System.out.println(ans.trim());
	}
}
