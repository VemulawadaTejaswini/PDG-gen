import java.util.Scanner;

/**
 * https://atcoder.jp/contests/dp/tasks/dp_a
 * Frog 1
 */
public class Main {

	public static void main(String...args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int[] h = new int[n];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
			}

			int[] dp = new int[n];
			dp[0] = 0;
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					dp[i] = 0;
				} else if (i == 1) {
					dp[i] = Integer.MAX_VALUE;
					dp[i] = mindp(dp[i], dp[i-1] + Math.abs(h[i]-h[i-1]));
				} else {
					dp[i] = Integer.MAX_VALUE;
					dp[i] = mindp(dp[i], dp[i-1] + Math.abs(h[i]-h[i-1]));
					dp[i] = mindp(dp[i], dp[i-2] + Math.abs(h[i]-h[i-2]));
				}
			}

			System.out.println(dp[n-1]);
		}
	}

	public static int mindp(int a, int b) {
		if (a > b) {
			a = b;
		}
		return a;
	}
}
