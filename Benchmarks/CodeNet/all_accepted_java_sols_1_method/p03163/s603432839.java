
import java.util.Scanner;


public class Main {

	static int[][] table;
	static long[][] dp;
	static int N;
	static int W;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		W = sc.nextInt();
		long max = 0;

		table = new int[N][2];
		for (int i = 0; i < N; i++) {
			table[i][0] =sc.nextInt();
			table[i][1] =sc.nextInt();
		}

		dp = new long[N + 1][W + 1];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= W; j++) {
				if (j - table[i][0] >= 0) {
					dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j - table[i][0]] + table[i][1]);
				}
				dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
			}
		}

		System.out.println(dp[N][W]);

	}

}
