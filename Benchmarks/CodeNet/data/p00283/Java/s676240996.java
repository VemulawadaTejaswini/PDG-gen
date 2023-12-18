
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int INF = 1 << 24;
		while (true) {
			int D = scanner.nextInt();
			int N = scanner.nextInt();
			if ((D | N) == 0)
				break;
			AER[] aer = new AER[N];
			for (int i = 0; i < N; i++) {
				aer[i] = new AER(scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt());
			}
			int[][] dp = new int[D + 1][101];
			for (int[] d : dp)
				Arrays.fill(d, INF);
			dp[D][0] = 0;
			for (int i = D; i > 0; i--) {
				for (int j = 0; j < 101; j++) {
					if (dp[i][j] == INF)
						continue;
					for (AER a : aer) {
						if (j < a.r)
							continue;
						int aa = Math.max(0, i - a.a);
						int bb = Math.min(100, j + a.e);
						dp[aa][bb] = Math.min(dp[aa][bb], dp[i][j] + 1);
					}
				}

			}
			int ans = INF;
			for (int i = 0; i < 101; i++) {
				ans = Math.min(ans, dp[0][i]);
			}
			System.out.println(ans == INF ? "NA" : ans);
		}
	}

	class AER {
		int a, e, r;

		public AER(int a, int e, int r) {
			super();
			this.a = a;
			this.e = e;
			this.r = r;
		}

		@Override
		public String toString() {
			return "AER [a=" + a + ", e=" + e + ", r=" + r + "]";
		}

	}
}