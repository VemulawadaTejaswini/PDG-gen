import java.io.IOException;
import java.util.Scanner;

/**
 * バブルソート
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
		
		bubbleSort(arr, n);
		
	}
	
	public static void bubbleSort(int[] arr, int n) {
		boolean flag = true;
		int count = 0;
		while (flag) {
			flag = false;
			for (int j = n-1; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					flag = true;
					count += 1;
				}
			}
		}
		printArray(arr);
		System.out.println(count);
	}
	
	public static void printArray(int[] arr) {
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i] + " ";
		}
		System.out.println(ans.trim());
	}
}
