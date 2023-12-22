import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] u = new int[n + 1];
		int[] v = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		sc.close();

		long[][] dp = new long[n + 1][w + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				long v1 = dp[i - 1][j];
				long v2 = 0;
				if (j >= u[i]) {
					v2 = dp[i - 1][j - u[i]] + v[i];
				}
				dp[i][j] = Math.max(v1, v2);
			}
		}

		long ans = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= w; j++) {
				ans = Math.max(ans, dp[i][j]);
			}
		}
		System.out.println(ans);
	}
}
