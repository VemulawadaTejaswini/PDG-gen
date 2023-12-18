import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static boolean solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		if (n + m == 0) return false;

		int[][][] time = new int[m][n][2000];

		int r = in.nextInt();
		for (int i=0; i<r; i++) {
			int t = in.nextInt();
			int p = in.nextInt() - 1;
			int x = in.nextInt() - 1;
			int s = in.nextInt();
			if (s == 1) {
				time[x][p][t]++;
			} else {
				time[x][p][t]--;
			}
		}

		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				for (int k=0; k<2000-1; k++) {
					time[i][j][k+1] += time[i][j][k];
				}
			}
		}

		int q = in.nextInt();
		while (q-- > 0) {
			int s = in.nextInt();
			int e = in.nextInt();
			int x = in.nextInt() - 1;
			int ans = 0;
			for (int i=s; i<e; i++) {
				boolean f = false;
				for (int j=0; j<n; j++) {
					if (time[x][j][i] > 0) f = true;
				}
				if (f) ans++;
			}
			out.println(ans);
		}

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		while(solve());
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}