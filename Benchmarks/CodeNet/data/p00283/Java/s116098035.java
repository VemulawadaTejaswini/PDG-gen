
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			d = scanner.nextInt();
			n = scanner.nextInt();
			if ((d | n) == 0)
				break;
			aer = new AER[n];
			for (int i = 0; i < n; i++) {
				aer[i] = new AER(scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt());
			}
			dp = new int[d + 1][101];
			for (int[] dpp : dp)
				Arrays.fill(dpp, -1);
			int ans = dfs(d, 0);
			System.out.println(ans == INF ? "NA" : ans);
		}
	}

	private int dfs(int hp, int exp) {
		if (hp == 0)
			return 0;
		if (dp[hp][exp] > -1)
			return dp[hp][exp];

		int res = INF;
		for (AER a : aer) {
			if (a.r > exp)
				continue;
			int nhp = Math.max(0, hp - a.a);
			int nexp = Math.min(100, exp + a.e);
			res = Math.min(res, dfs(nhp, nexp) + 1);
		}
		return dp[hp][exp] = res;
	}

	int d, n;
	int[][] dp;
	int INF = 1 << 30;
	AER[] aer;

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