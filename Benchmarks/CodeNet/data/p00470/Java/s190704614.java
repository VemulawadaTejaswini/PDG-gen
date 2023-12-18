
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int mod = 100000;
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int[][][] dp = new int[4][h][w];
			for (int i = 0; i < h; i++)
				dp[0][i][0] = 1;
			for (int i = 0; i < w; i++)
				dp[2][0][i] = 1;
			for (int i = 1; i < h; i++) {
				for (int j = 1; j < w; j++) {
					dp[0][i][j] = (dp[0][i - 1][j] + dp[1][i - 1][j]) % mod;
					dp[1][i][j] = dp[2][i - 1][j] % mod;
					dp[2][i][j] = (dp[2][i][j - 1] + dp[3][i][j - 1]) % mod;
					dp[3][i][j] = dp[0][i][j - 1] % mod;
				}

			}
			int ans = 0;
			for (int i = 0; i < 4; i++) {
				ans += dp[i][h - 1][w - 1];
			}
			System.out.println(ans % mod);

		}
	}
}