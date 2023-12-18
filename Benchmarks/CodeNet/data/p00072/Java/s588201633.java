import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static Set<int[]> edges(int n, int[] f, int[] t, int[] w,
			boolean ce, boolean cw) {
		Set<int[]> e = new HashSet<int[]>();
		for (int i = 0; i < n; i++) {
			e.add(new int[] { f[i], t[i], w[i] });
			if (ce)
				e.add(new int[] { f[i], t[i], cw ? -w[i] : w[i] });
		}
		return e;
	}

	public static int prim(Set<int[]> e, int nodes, int s) {
		final int[] d = new int[nodes];
		Arrays.fill(d, 0);// 到達フラグ
		// 距離優先
		TreeSet<int[]> ts = new TreeSet<int[]>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return (d[a[1]] - d[a[0]]) != (d[b[1]] - b[a[0]]) ? ((d[a[1]] - d[a[0]]) - (d[b[1]] - b[a[0]]))
						: (a[2] - b[2]);
			}
		});
		ts.addAll(e);
		int[] ne = ts.pollFirst();
		d[ne[0]] = d[ne[1]] = 1;
		int w = ne[2];
		while (!ts.isEmpty()) {
			ne = ts.pollFirst();
			if (d[ne[0]] == 0 || d[ne[1]] == 1)
				break;
			d[ne[1]] = 1;
			w += ne[2];
		}
		return w;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int m = sc.nextInt();
			int[] f = new int[m];
			int[] t = new int[m];
			int[] w = new int[m];
			for (int i = 0; i < m; i++) {
				f[i] = sc.nextInt();
				t[i] = sc.nextInt();
				w[i] = (sc.nextInt() - 100) / 100;
			}
			sc.nextInt();
			Set<int[]> e = edges(n, f, t, w, true, false);
			System.out.println(prim(e, n, 0));
		}
	}
}