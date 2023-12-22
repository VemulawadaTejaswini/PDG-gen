import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int R[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			R[i]  = scan.nextInt();
		}

		int ans = Integer.MIN_VALUE;
		int max = R[0];
		
		for (int i = 0; i < n - 1; i++) {
			if (max == R[i]) {
				int array[] = new int[n - i - 1];
				System.arraycopy(R, i + 1, array, 0, n - i - 1);
				Arrays.sort(array);
				max = array[array.length-1];
			}
			ans = Math.max(ans, max - R[i]);
		}

		System.out.println(ans);
		scan.close();
	}

}