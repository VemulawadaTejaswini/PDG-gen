import java.io.IOException;
import java.util.Arrays;

public class Main {

	private static final int INF = 1000001;

	public static void main(String[] args) {
		int[] pollock = new int[180];// 180*181*182/6が条件内で最大の正四面体数
		for (int i = 1; i <= pollock.length; i++) {
			pollock[i - 1] = (i * (i + 1) * (i + 2)) / 6;
		}

		int[][] dp = new int[2][INF];// dp[奇数？][jを作るのに必要な正四面体数の数の最小値]
		Arrays.fill(dp[0], Integer.MAX_VALUE);// 全部用
		Arrays.fill(dp[1], Integer.MAX_VALUE);// 奇数用

		// 最初は0
		dp[0][0] = 0;
		dp[1][0] = 0;

		for (int i = 0; i < pollock.length; i++) {
			for (int j = pollock[i]; j < INF; j++) {
				// 各pollock数について、調べる
				dp[0][j] = Math.min(dp[0][j], dp[0][j - pollock[i]] + 1);
				if (pollock[i] % 2 == 1) {
					// pollock数が奇数の時
					dp[1][j] = Math.min(dp[1][j], dp[1][j - pollock[i]] + 1);
				}
			}

		}

		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}

			System.out.println(dp[0][N] + " " + dp[1][N]);

		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}