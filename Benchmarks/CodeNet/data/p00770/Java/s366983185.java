import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static final int MAX_WH = 1002;

	static int matrix[][] = new int[MAX_WH][MAX_WH];
	static boolean prime[] = new boolean[1000001];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		isPrime();
		map();

		while (true) {
			String str[] = br.readLine().split(" ");
			int m = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);

			if (n == 0 && m == 0) {
				break;
			}

			int sx = -1;
			int sy = -1;
			for (int i = 0; i < MAX_WH; i++) {
				for (int j = 0; j < MAX_WH; j++) {
					if (matrix[i][j] == n) {
						sy = i;
						sx = j;
					}
				}
			}

			int[][] dp = new int[MAX_WH][MAX_WH];
			dp[sy][sx] = 1;
			int ansSize = 1;
			int ansRoute = 0;
			for (int i = sy; i < MAX_WH; i++) {
				for (int j = 0; j < MAX_WH; j++) {
					if (i == sy && matrix[i][j] != n)
						continue;
					if (matrix[i][j] > m)
						continue;
					if (dp[i][j] == 0)
						continue;

					if (prime[matrix[i][j]]) {
						dp[i][j]++;
						if (ansSize < dp[i][j]) {
							ansSize = dp[i][j];
							ansRoute = matrix[i][j];
						} else if (ansSize == dp[i][j]) {
							if (ansRoute < matrix[i][j]) {
								ansRoute = matrix[i][j];
							}
						}
					}

					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
					if (j >= 1) {
						dp[i + 1][j - 1] = Math.max(dp[i + 1][j - 1], dp[i][j]);
					}
					if (j + 1 < 1002) {
						dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j]);
					}
				}
			}
			System.out.println(ansSize - 1 + " " + ansRoute);
		}
	}

	static void map() {
		for (int i = 0; i < MAX_WH; i++) {
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
		}
		int now = 1;
		int x = MAX_WH / 2 - 1;
		int y = MAX_WH / 2 - 1;
		for (int i = 1; now <= 1000000; i++) {
			if (i % 2 == 1) {
				for (int j = 0; j < i && now <= 1000000; j++) {
					matrix[y][x] = now;
					x++;
					now++;
				}
				for (int j = 0; j < i && now <= 1000000; j++) {
					matrix[y][x] = now;
					y--;
					now++;
				}
			} else {
				for (int j = 0; j < i && now <= 1000000; j++) {
					matrix[y][x] = now;
					x--;
					now++;
				}
				for (int j = 0; j < i && now <= 1000000; j++) {
					matrix[y][x] = now;
					y++;
					now++;
				}
			}
		}
	}

	static void isPrime() {
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i <= 1000000; i++) {
			for (int j = i + i; j <= 1000000; j += i) {
				prime[j] = false;
			}

		}
	}
}

