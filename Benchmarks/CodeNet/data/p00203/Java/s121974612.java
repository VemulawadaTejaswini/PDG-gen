import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		for (;;) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if ((X | Y) == 0) {
				return;
			}
			int[][] field = new int[Y][X];
			int[][] dp = new int[Y][X];
			for (int i = 0; i < Y; i++) {
				for (int j = 0; j < X; j++) {
					field[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < X; i++) {
				if (field[0][i] == 0) {
					dp[0][i] = 1;
				}
			}
			for (int i = 1; i < Y; i++) {
				for (int j = 0; j < X; j++) {
					int cnt = 0;
					if (field[i][j] == 1) {
						continue;
					}
					if (j - 1 >= 0 && field[i][j] != 2
							&& field[i - 1][j - 1] != 1
							&& field[i - 1][j - 1] != 2) {
						cnt += dp[i - 1][j - 1];
					}
					if (field[i - 1][j] != 2) {
						cnt += dp[i - 1][j];
					}
					if (i - 2 > 0 && field[i - 2][j] == 2) {
						cnt += dp[i - 2][j];
					}
					if (j + 1 < X && field[i][j] != 2
							&& field[i - 1][j + 1] != 1
							&& field[i - 1][j + 1] != 2) {
						cnt += dp[i - 1][j + 1];
					}
					dp[i][j] = cnt;
				}
			}
			//System.out.println("------");
			//debug2(dp);
			int ans = 0;
			for (int i = 0; i < X; i++) {
				ans += dp[Y - 1][i];
				if (Y - 2 >= 0 && field[Y - 2][i] == 2) {
					ans += dp[Y - 2][i];
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}