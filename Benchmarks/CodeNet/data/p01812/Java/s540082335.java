import java.util.LinkedList;
import java.util.Queue;

public class ICPC {

	private static void solve() {
		int n = nei();
		int m = nei();
		int k = nei();
		int[] ds = nis(m);
		int[][] vs = nis2(n, k);
		for (int i = 0; i < m; i++) {
			ds[i]--;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				vs[i][j]--;
			}
		}
		int[] idxToDark = new int[n];
		for (int i = 0; i < n; i++) {
			idxToDark[i] = -1;
		}
		for (int i = 0; i < m; i++) {
			idxToDark[ds[i]] = i;
		}
		int MAX_BIT = 1 << m;
		int[][] edges = new int[MAX_BIT][k];
		for (int i = 1; i < MAX_BIT; i++) {
			for (int j = 0; j < k; j++) {
				int to = 0;

				int msb = i;
				msb = msb | msb >> 1;
				msb = msb | msb >> 2;
				msb = msb | msb >> 4;
				msb = msb | msb >> 8;
				msb = msb | msb >> 16;

				int pop = msb;
				pop = (pop & 0x55555555) + (pop >> 1 & 0x55555555);
				pop = (pop & 0x33333333) + (pop >> 2 & 0x33333333);
				pop = (pop & 0x0f0f0f0f) + (pop >> 4 & 0x0f0f0f0f);
				pop = (pop & 0x00ff00ff) + (pop >> 8 & 0x00ff00ff);
				pop = (pop & 0x0000ffff) + (pop >> 16 & 0x0000ffff);
				pop--;

				msb++;
				msb >>= 1;

				int lower = edges[i & ~msb][j];

				int darkIdx = ds[pop];
				int toDarkIdx = idxToDark[vs[darkIdx][j]];
				if (toDarkIdx != -1) {
					to = 1 << toDarkIdx;
				}

				edges[i][j] = to | lower;
			}
		}

		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { MAX_BIT - 1, 0 });
		boolean[] visited = new boolean[MAX_BIT];
		while (!q.isEmpty()) {
			int[] current = q.poll();
			int idx = current[0];
			if (visited[idx])
				continue;
			visited[idx] = true;
			int cost = current[1];
			if (idx == 0)
				kil(cost);

			for (int i = 0; i < k; i++) {
				q.add(new int[] { edges[idx][i], cost + 1 });
			}
		}
	}

	static void out(String val) {
		IO.out(val);
	}

	static void out(Object val) {
		IO.out(String.valueOf(val));
	}

	static void out(int val) {
		IO.out(String.valueOf(val));
	}

	static void out(long val) {
		IO.out(String.valueOf(val));
	}

	static void out(char val) {
		IO.out(String.valueOf(val));
	}

	static void out(float val) {
		IO.out(String.valueOf(val));
	}

	static void out(double val) {
		IO.out(String.valueOf(val));
	}

	static void out(boolean val) {
		IO.out(String.valueOf(val));
	}

	static void kil(String val) {
		IO.out(val);
		IO.flush();
		System.exit(0);
	}

	static void kil(Object val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(int val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(long val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(char val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(float val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(double val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(boolean val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static String nes() {
		return IO.next();
	}

	static int nei() {
		return IO.nextInt();
	}

	static long nel() {
		return IO.nextLong();
	}

	static double ned() {
		return IO.nextDouble();
	}

	static char nec() {
		return IO.nextChar();
	}

	static String[] nss(int n) {
		String[] as = new String[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.next();
		}
		return as;
	}

	static int[] nis(int n) {
		int[] as = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextInt();
		}
		return as;
	}

	static long[] nls(int n) {
		long[] as = new long[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextLong();
		}
		return as;
	}

	static double[] nds(int n) {
		double[] as = new double[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextDouble();
		}
		return as;
	}

	static char[] ncs(int n) {
		char[] as = new char[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextChar();
		}
		return as;
	}

	static String[][] nss2(int n, int m) {
		String[][] as = new String[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.next();
			}
		}
		return as;
	}

	static int[][] nis2(int n, int m) {
		int[][] as = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextInt();
			}
		}
		return as;
	}

	static long[][] nls2(int n, int m) {
		long[][] as = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextLong();
			}
		}
		return as;
	}

	static double[][] nds2(int n, int m) {
		double[][] as = new double[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextDouble();
			}
		}
		return as;
	}

	static char[][] ncs2(int n, int m) {
		char[][] as = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextChar();
			}
		}
		return as;
	}

	static int parseInt(String val) {
		return Integer.parseInt(val);
	}

	static int parseInt(char val) {
		return Integer.parseInt(String.valueOf(val));
	}

	static long parseLong(String val) {
		return Long.parseLong(val);
	}

	public static void main(String[] args) {
//		try {
		solve();
		IO.flush();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}

