import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] h = new int[n];
			for(int i = 0 ; i < n ; i++) {
				h[i] = sc.nextInt();
			}
			int[] dp = new int[n];
			for(int i = 0 ; i < n ; i++) {
				if(i == 0) {
					dp[i] = 0;
				} else if(i == 1) {
					dp[i] = dp[i - 1] + Math.abs(h[i - 1] - h[i]);
				} else {
					dp[i] = Math.min(dp[i - 2] + Math.abs(h[i - 2] - h[i]), dp[i - 1] + Math.abs(h[i - 1] - h[i]));
				}
			}
			System.out.println(dp[n - 1]);

		}
	}
}
