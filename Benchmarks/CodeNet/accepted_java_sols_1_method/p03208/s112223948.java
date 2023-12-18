import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		Arrays.sort(h);

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n - k + 1; i++) {
			min = Math.min(min, h[i + k -1] -h[i]);
		}
		System.out.println(min);
	}
}
