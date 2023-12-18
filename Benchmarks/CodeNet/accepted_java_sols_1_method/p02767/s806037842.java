import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		long min = Integer.MAX_VALUE;
		long sum = 0L;
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < n; j++) {
				sum += (long) Math.pow(x[j] - i, 2);
			}
			
			if (sum < min) {
				min = sum;
			}
			sum = 0L;
		}
		System.out.println(min);
	}
}
