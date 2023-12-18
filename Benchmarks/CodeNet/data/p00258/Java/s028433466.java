import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	int pop_count(int bs) {
		int cnt = 0;
		for (int i = 0; i < 16; ++i) {
			cnt += (bs >> i) & 1;
		}
		return cnt;
	}

	void run() {
		for (;;) {
			int n = ni();
			int c = ni();
			if ((n | c) == 0) {
				break;
			}
			int[] a = new int[n + 1];
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < 16; ++j) {
					int v = ni();
					a[i] |= v << j;
				}
			}
			int[] b = new int[n];
			for (int i = 0; i < c; ++i) {
				for (int j = 0; j < 16; ++j) {
					int v = ni();
					b[i] |= v << j;
				}
			}

			int[][] dp = new int[n + 1][1 << 16];
			for (int i = 0; i <= n; ++i) {
				Arrays.fill(dp[i], -1);
			}
			dp[0][a[0]] = 0;
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < 1 << 16; ++j) {
					if (dp[i][j] == -1) {
						continue;
					}
					for (int k = 0; k < c; ++k) {
						int cnt = pop_count(b[k] & j);
						int nbs = ((b[k] ^ j) & j) | a[i + 1];

						dp[i + 1][nbs] = Math.max(dp[i + 1][nbs], dp[i][j]
								+ cnt);
					}
				}
			}

			int ans = 0;
			for (int i = 0; i < 1 << 16; ++i) {
				ans = Math.max(ans, dp[n][i]);
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	int ni() {
		return Integer.parseInt(sc.next());
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}