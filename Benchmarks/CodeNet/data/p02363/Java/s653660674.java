import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	long INF = Long.MAX_VALUE / 10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		long[][] D = new long[V][V];
		long[][] W = new long[V][V];
		for (int i = 0; i < V; ++i) {
			Arrays.fill(D[i], INF);
			Arrays.fill(W[i], INF);
			W[i][i] = 0;
			D[i][i] = 0;
		}
		for (int i = 0; i < E; ++i)
			D[sc.nextInt()][sc.nextInt()] = sc.nextLong();
		W = mul(pow(D, V), W);
		for (int i = 0; i < V; ++i)
			if (D[i][i] < 0) {
				System.out.println("NEGATIVE CYCLE");
				return;
			}
		for (int i = 0; i < V; ++i)
			for (int j = 0; j < V; ++j)
				System.out.print((W[i][j] >= INF ? "INF" : W[i][j]) + (j == V - 1 ? "\n" : " "));

	}

	long[][] pow(long[][] a, long n) {
		long[][] ret = new long[a.length][a.length];
		for (int i = 0; i < n; ++i) {
			Arrays.fill(ret[i], INF);
			ret[i][i] = 0;
		}
		for (; n > 0; n >>= 1, a = mul(a, a))
			if (n % 2 == 1)
				ret = mul(ret, a);

		return ret;
	}

	long[][] mul(long[][] a, long[][] b) {
		int n = a.length;
		long[][] ret = new long[n][n];
		for (int i = 0; i < n; ++i)
			Arrays.fill(ret[i], INF);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				for (int m = 0; m < n; ++m) {
					if (ret[i][j] >= INF && (Math.max(a[i][m], b[m][j]) >= INF))
						ret[i][j] = INF;
					else
						ret[i][j] = Math.min(ret[i][j], a[i][m] + b[m][j]);
				}
			}
		}
		return ret;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}