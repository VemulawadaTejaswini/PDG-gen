import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		int[] dp = new int[100100];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= k; j++) {
				if(i - j >= 0) dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
			}
		}

		System.out.println(dp[n - 1]);
	}
}