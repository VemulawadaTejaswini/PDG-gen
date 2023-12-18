import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);

	int M = 1000000;
	boolean[] prime = new boolean[M + 1];

	void run() {
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int i = 2; i * i <= M; i++) {
			if (!prime[i]) {
				continue;
			}
			for (int j = i * 2; j <= M; j += i) {
				prime[j] = false;
			}
		}

		for (;;) {
			int m = sc.nextInt(); // all hall
			int n = sc.nextInt(); // start number
			if ((m | n) == 0) {
				return;
			}
			int[][] field = new int[1001][1001];
			int[][] dp = new int[1001][1001];
			boolean[][] visit = new boolean[1001][1001];
			int x = 500;
			int y = 500;
			int right = 1;
			int up = 1;
			int left = 2;
			int down = 2;
			field[500][500] = 1;
			label: for (int i = 2; i <= m;) {
				for (int j = 1; j <= right; j++) {
					field[y][++x] = i++;
					if (i > m) {
						break label;
					}
				}
				for (int j = 1; j <= up; j++) {
					field[--y][x] = i++;
					if (i > m) {
						break label;
					}
				}
				for (int j = 1; j <= left; j++) {
					field[y][--x] = i++;
					if (i > m) {
						break label;
					}
				}
				for (int j = 1; j <= down; j++) {
					field[++y][x] = i++;
					if (i > m) {
						break label;
					}
				}
				right += 2;
				up += 2;
				left += 2;
				down += 2;
			}

			int startX = 0;
			int startY = 0;
			for (int i = 0; i <= 1000; i++) {
				for (int j = 0; j <= 1000; j++) {
					if (field[i][j] == n) {
						startX = j;
						startY = i;
					}
				}
			}
			visit[startY][startX] = true;
			for (int i = startY + 1; i <= 1000; i++) {
				for (int j = 0; j <= 1000; j++) {
					if (j - 1 >= 0 && visit[i - 1][j - 1]) {
						visit[i][j] = true;
					}
					if (visit[i - 1][j]) {
						visit[i][j] = true;
					}
					if (j + 1 <= 1000 && visit[i - 1][j + 1]) {
						visit[i][j] = true;
					}
				}
			}
			int ansCnt = 0;
			int ansNum = 0;
			for (int i = startY; i <= 1000; i++) {
				for (int j = 0; j <= 1000; j++) {
					if (!visit[i][j]) {
						continue;
					}
					int cnt = 0;
					if (i - 1 >= 0 && j - 1 > 0 && visit[i - 1][j - 1]) {
						cnt = Math.max(cnt, dp[i - 1][j - 1]);
					}
					if (i - 1 >= 0 && visit[i - 1][j]) {
						cnt = Math.max(cnt, dp[i - 1][j]);
					}
					if (i - 1 >= 0 && j + 1 <= 1000 && visit[i - 1][j + 1]) {
						cnt = Math.max(cnt, dp[i - 1][j + 1]);
					}
					dp[i][j] = cnt + (prime[field[i][j]] ? 1 : 0);
					if (ansCnt <= dp[i][j]) {
						ansCnt = dp[i][j];
						if (prime[field[i][j]]) {
							if (ansNum < field[i][j]) {
								ansNum = field[i][j];
							}
						}
					}
				}
			}
			System.out.println(ansCnt + " " + ansNum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 495; i < 505; i++) {
			for (int j = 495; j < 505; j++) {
				System.out.printf("%02d ", array[i][j]);
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