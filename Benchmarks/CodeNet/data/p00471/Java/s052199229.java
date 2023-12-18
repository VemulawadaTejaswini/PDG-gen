import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static int w,h,si,sj,n;
	static int[][] table;
	static int[][] dp;

	static boolean solve() {
		w = in.nextInt();
		h = in.nextInt();
		if (w == 0 && h == 0) return false;
		table = new int[h][w];

		si = -1; sj = -1;
		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int i=0; i<h; i++) {
			for (int j=0; j<w; j++) {
				int tmp = in.nextInt();
				table[i][j] = -1;
				if (tmp == 1) {
					table[i][j] = list.size();
					list.add(new int[]{i,j});
				} else {
					si = i; sj = j;
				}
			}
		}

		n = list.size();

		dp = new int[1<<n][n];
		for (int i=0; i<1<<n; i++) {
			Arrays.fill(dp[i],-1);
		}

		out.println(rec(0,si,sj));
		return true;
	}

	static int[] di = {0,1,0,-1};
	static int[] dj = {1,0,-1,0};

	static int rec(int visited, int ci, int cj) {
		int cur = table[ci][cj];
		if (cur >= 0 && dp[visited][cur] != -1) return dp[visited][cur];
		if (Integer.bitCount(visited) == n) {
			return check(visited, ci, cj, si, sj) ? 1 : 0;
		}

		int res = 0;

		for (int k=0; k<4; k++) {
			int ni = ci + di[k];
			int nj = cj + dj[k];
			while (0 <= ni && 0 <= nj && ni < h && nj < w) {
				if (table[ni][nj] >= 0) {
					if (((visited>>table[ni][nj])&1) == 0) res += rec(((1<<table[ni][nj])|visited), ni, nj);
					else break;
				}
				ni += di[k];
				nj += dj[k];
			}
		}

		return cur >= 0 ? dp[visited][cur] = res : res;
	}

	static boolean check(int visited, int ci, int cj, int ti, int tj) {
		if (ci != ti && cj != tj) return false;
		if (ci == ti) {
			int from = Math.min(cj,tj);
			int to = Math.max(cj,tj);
			for (int j=from+1; j<to; j++) {
				if (table[ci][j] >= 0 && ((visited>>table[ci][j])&1) == 1) return false;
			}
		} else if (cj == tj) {
			int from = Math.min(ci,ti);
			int to = Math.max(ci,ti);
			for (int i=from+1; i<to; i++) {
				if (table[i][cj] >= 0 && ((visited>>table[i][cj])&1) == 1) return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		while(solve());
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}