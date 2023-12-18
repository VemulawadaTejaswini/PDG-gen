import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	static ArrayList<Integer>[] g;
	static int N;
	static int[] B;
	static int[] C;
	static long[] sum;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			if (N == 0)
				break;
			String[] A = new String[N];
			B = new int[N];
			C = new int[N];
			String[][] D = new String[N][];
			HashMap<String, Integer> id = new HashMap<>();
			sum = new long[N];
			for (int i = 0; i < N; ++i) {
				A[i] = sc.next();
				B[i] = sc.nextInt();
				C[i] = sc.nextInt();
				D[i] = new String[C[i]];
				for (int j = 0; j < C[i]; ++j) {
					D[i][j] = sc.next();
				}
				id.put(A[i], i);
			}
			for (int i = N - 1; i >= 0; --i) {
				sum[i] = (i + 1 < N ? sum[i + 1] : 0) + B[i];
			}

			g = new ArrayList[N];
			for (int i = 0; i < N; ++i)
				g[i] = new ArrayList<>();

			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < C[i]; ++j) {
					int dst = id.get(D[i][j]);
					g[i].add(dst);
					g[dst].add(i);
				}
			}
			id.clear();
			D = null;
			A = null;
			opt = B[0];
			System.out.println(dfs(1, 1, B[0]) + B[0]);
			B = null;
			C = null;
			sum = null;
			 if ((Runtime.getRuntime().totalMemory() -
			 Runtime.getRuntime().freeMemory()) / 1000 < 400)
			 System.gc();
		}
	}

	static long opt;

	static long dfs(long used, int cur, long cursum) {
		if (cur >= N)
			return 0;
		if (sum[cur] + cursum < opt) {
			return 0;
		}
		long res = 0;
		boolean unadj = true;
		boolean unrestriected = true;
		for (int dst : g[cur]) {
			if (!(dst < cur && ((used >> dst) & 1) == 0)) {
				unadj = false;
			}
			if (((used >> dst) & 1) == 1) {
				unrestriected = false;
			}
		}
		if (unrestriected) {
			res = Math.max(res, dfs(used | (1L << cur), cur + 1, cursum + B[cur]) + B[cur]);
		}
		if (!unadj) {
			res = Math.max(res, dfs(used, cur + 1, cursum));
		}
		opt = Math.max(opt, cursum + res);
		return res;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}