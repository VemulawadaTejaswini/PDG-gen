import java.util.Scanner;

public class Main {
	static class Pair {
		int first;
		int second;

		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int w = in.nextInt();
			Pair[] a = new Pair[n];

			for (int i = 0; i < n; i++) {
				int vv = in.nextInt();
				int ww = in.nextInt();

				a[i] = new Pair(vv, ww);
			}

			System.out.printf("%d\n", knapsack(w, a));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private static long knapsack(int w, Pair[] a) {
		int n = a.length;
		long[][] dp = new long[n+1][w+1];

		for (int i = 0; i < n+1; i++) {
			for (int j = 0; j < w+1; j++)
				dp[i][j] = 0;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= w; j++) {
				dp[i][j] = dp[i-1][j];

				if (a[i-1].second <= j) {
					long v = dp[i-1][j-a[i-1].second] + a[i-1].first;

					if (v > dp[i][j])
						dp[i][j] = v;
				}
			}
		}

		return dp[n][w];
	}
}