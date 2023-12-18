import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][][] dp = new int[21][11][156];
		dp[0][0][0] = 1;
		for (int n = 1; n <= 20; ++n) {
			for (int k = 0; k <= 10; ++k) {
				for (int s = 0; s <= 155; ++s) {
					dp[n][k][s] += dp[n - 1][k][s];
					if (k > 0 && s >= n) dp[n][k][s] += dp[n - 1][k - 1][s - n];
				}
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int K = sc.nextInt();
			int S = sc.nextInt();
			System.out.println(dp[N][K][S]);
		}
	}

}