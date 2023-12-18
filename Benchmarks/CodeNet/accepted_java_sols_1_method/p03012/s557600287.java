import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int sum1 = 0;
			for (int j = 0; j <= i; j++) {
				sum1 += w[j];
			}
			int sum2 = 0;
			for (int j = i + 1; j < n; j++) {
				sum2 += w[j];
			}
			if (Math.abs(sum1 - sum2) < min) {
				min = Math.abs(sum1 - sum2);
			}
		}
		System.out.println(min);
	}
}
