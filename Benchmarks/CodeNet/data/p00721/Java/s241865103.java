import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(solve());
	}
	
	public static int INF = 1 << 29;
	public static int[] D = {1,0,-1,0};
	
	public static boolean solve() {
		int w = sc.nextInt();
		int h = sc.nextInt();
		if (w == 0) {
			return false;
		}
		char[][] m = new char[h][];
		for(int i=0;i<h;i++) {
			m[i] = sc.next().toCharArray();
		}
		int si = -1,sj = -1;
		int n = 1;
		int[] oi = new int[11];
		int[] oj = new int[11];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if (m[i][j] == 'o') {
					si = i;
					sj = j;
				}else if(m[i][j] == '*') {
					oi[n] = i;
					oj[n] = j;
					n++;
				}
			}
		}
		oi[0] = si;
		oj[0] = sj;
		int[][] dist = new int[n][n];
		for(int i=0;i<n;i++) {
			int[][] d = new int[h][w];
			for(int j=0;j<h;j++) {
				Arrays.fill(d[j], INF);
			}
			Queue<Integer> q = new ArrayDeque<>();
			q.offer(oi[i] * 100 + oj[i]);
			d[oi[i]][oj[i]] = 0;
			while (!q.isEmpty()) {
				int c = q.poll();
				int ci = c / 100;
				int cj = c % 100;
				int cd = d[ci][cj];
				for(int k=0;k<4;k++) {
					int ni = ci + D[k];
					int nj = cj + D[k^1];
					if (ni < 0 || ni >= h || nj < 0 || nj >= w || m[ni][nj] == 'x' || d[ni][nj] <= cd + 1) {
						continue;
					}
					d[ni][nj] = cd + 1;
					q.offer(ni * 100 + nj);
				}
			}
			for(int j=0;j<n;j++) {
				dist[i][j] = d[oi[j]][oj[j]];
			}
		}
//		System.out.println(Arrays.deepToString(dist));
		int[][] dp = new int[n][1<<n];
		for(int i=0;i<n;i++) {
			Arrays.fill(dp[i], INF);
		}
		dp[0][1] = 0;
		for(int j=0;j<1<<n;j++) {
			for(int i=0;i<n;i++) {
				if (dp[i][j] == INF) {
					continue;
				}
				for(int k=0;k<n;k++) {
					if ((j >> k & 1) == 1) {
						continue;
					}
					int nj = j | (1 << k);
					dp[k][nj] = Math.min(dp[k][nj], dp[i][j] + dist[i][k]);
				}
			}
		}
		int ans = INF;
		for(int i=0;i<n;i++) {
			ans = Math.min(ans, dp[i][(1 << n) - 1]);
		}
		System.out.println(ans == INF ? -1 : ans);
		return true;
	}

}