import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Integer[] arr = new Integer[n];
		int sum = 0;
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		double limit = (double) sum/(4*m);

		if (arr[m-1] >= limit) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
