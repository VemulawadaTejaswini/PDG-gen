import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 100000;

	void run() {
		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((w | h) == 0) return;
			// 0:?????£???????????????
			// 1:?????£????????±??????
			// 2:????????£????????????
			// 3:????????£?????±??????
			int[][][] dp = new int[h][w][4];
			dp[0][0][2] = 1;
			dp[0][0][3] = 1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (i + 1 < h) dp[i + 1][j][0] = (dp[i + 1][j][0] + dp[i][j][0] + dp[i][j][2]) % MOD;
					if (i + 1 < h) dp[i + 1][j][2] = (dp[i + 1][j][2] + dp[i][j][1]) % MOD;
					if (j + 1 < w) dp[i][j + 1][1] = (dp[i][j + 1][1] + dp[i][j][1] + dp[i][j][3]) % MOD;
					if (j + 1 < w) dp[i][j + 1][3] = (dp[i][j + 1][3] + dp[i][j][0]) % MOD;
				}
			}
			int ans = 0;
			for (int i = 0; i < 4; i++) ans += dp[h - 1][w - 1][i];
			System.out.println(ans % MOD);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}