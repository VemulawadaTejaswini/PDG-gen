import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static HashMap<Integer,Integer> link = new HashMap<>();

	static int prim(int n) {
		BitSet used = new BitSet();
		int[] cost = new int[n];
		Arrays.fill(cost, 1<<29);
		int res = 0;
		cost[0] = 0;

		while(true) {
			int v = -1;
			for (int i=0; i<n; i++) {
				if (!used.get(i) && (v == -1 || cost[i] < cost[v])) v = i;
			}

			if (v == -1) break;
			used.set(v);
			res += cost[v];
			for (int i=0; i<n; i++) {
				if (link.containsKey(i*n+v)) {
					cost[i] = Math.min(cost[i], link.get(i*n+v));
				}
			}
		}

		return res;
	}

	static void solve() {
		int v = in.nextInt();
		int e = in.nextInt();
		for (int i=0; i<e; i++) {
			int s = in.nextInt();
			int t = in.nextInt();
			int w = in.nextInt();
			link.put(s*v+t, w);
			link.put(t*v+s, w);
		}
		// dump(link);
		out.println(prim(v));
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}