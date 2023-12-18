import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n+1];
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				p[i] = in.nextInt();
				in.nextInt();
			} else if (i == n-1) {
				p[i] = in.nextInt();
				p[i+1] = in.nextInt();
			} else {
				p[i] = in.nextInt();
				in.nextInt();
			}
		}

		int[][] dp = new int[n+1][n+1];

		for (int l = 2; l <= n; l++) {
			for (int i = 1; i <= n - l + 1; i++) {
				int j = i + l - 1;
				dp[i][j] = Integer.MAX_VALUE;
				for (int k = i; k < j; k++) {
					dp[i][j] = Math.min(dp[i][k]+dp[k+1][j]+p[i-1]*p[k]*p[j],dp[i][j]);
				}
			}
		}

		System.out.println(dp[1][n]);

	}

}

