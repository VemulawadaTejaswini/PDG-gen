import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}
			int M = nextInt();

			int[] codebook = new int[M];
			for (int i = 0; i < codebook.length; i++) {
				codebook[i] = nextInt();
			}

			int[][] dp = new int[N + 1][256];// i個目の音でy=jになった時の最小値
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], Integer.MAX_VALUE);// 全部最大で埋めておく
			}
			dp[0][128] = 0;

			for (int i = 0; i < N; i++) {
				int x = nextInt();
				for (int j = 0; j < dp[i].length; j++) {
					if (dp[i][j] < Integer.MAX_VALUE) {
						int y = j;
						for (int k = 0; k < codebook.length; k++) {
							int nextY = y + codebook[k];
							if (nextY < 0) {
								nextY = 0;
							} else if (nextY > 255) {
								nextY = 255;
							}
							dp[i + 1][nextY] = Math.min(
									dp[i][j] + (int) Math.pow(x - nextY, 2),
									dp[i + 1][nextY]);
						}
					}
				}
			}
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < dp[N].length; i++) {
				ans = Math.min(ans, dp[N][i]);
			}

			System.out.println(ans);
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