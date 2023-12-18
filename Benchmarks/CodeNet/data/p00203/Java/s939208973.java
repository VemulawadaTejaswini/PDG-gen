import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int h, w;
	static int[][] t, dp;

	static int[] dy = { 1, 1, 1,};
	static int[] dx = { -1, 0, 1};

	static int rec(int cy, int cx) {
		if (cy > h-1) return 1;
		if (cy == h-1) return t[cy][cx] != 1 ? 1 : 0;
		if (dp[cy][cx] != -1) return dp[cy][cx];
		if (t[cy][cx] == 2) return dp[cy][cx] = rec(cy+2, cx);
		int res = 0;
		for (int i=0; i<3; i++) {
			int ny = cy + dy[i];
			int nx = cx + dx[i];
			if (nx < 0 || w <= nx) continue;
			if (t[ny][nx] == 1) continue;
			if (t[ny][nx] == 2 && nx != cx) continue;
			res += rec(ny, nx);
		}
		return dp[cy][cx] = res;
	}

	static boolean solve() {
		w = in.nextInt();
		h = in.nextInt();
		if (w + h == 0) return false;

		t = new int[h][w];
		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				t[i][j] = in.nextInt();
			}
		}

		dp = new int[h][w];
		for (int i=0; i<h; i++) {
			Arrays.fill(dp[i], -1);
		}

		int ans = 0;
		for (int i=0; i<w; i++) {
			if (t[0][i] != 1) {
				ans += rec(0, i);
			}
		}

		out.println(ans);

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