
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	boolean[] prime;
	int[][] map;
	int[][][] dp;
	HashMap<Integer, P> p2ind;
	int MAX = 1050, M = 1000000;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		pre();
		
		for(;;) {
			int n = sc.nextInt(), s = sc.nextInt();
			if((n|s) == 0) break;
			
			for(int[][] a: dp) for(int[] b: a) fill(b, -1);
			
			P p = p2ind.get(s);
			dp[p.y][p.x][0] = prime[s]? 0: 1; dp[p.y][p.x][1] = prime[s]? 0:s;
			
			int ansn = 0, ansp = 0;
			for(int y=1;y<MAX;y++) for(int x=1;x<MAX-1;x++) {
				if(map[y][x] > n) continue;
				for(int dx=-1;dx<=1;dx++) if(map[y-1][x+dx] <= n && dp[y-1][x+dx][0] >= 0) {
					if(!prime[map[y][x]]) {
						dp[y][x][0] = max(dp[y][x][0], dp[y-1][x+dx][0] + 1);
						dp[y][x][1] = map[y][x];
					} else {
						if(dp[y][x][0] < dp[y-1][x+dx][0]) {
							dp[y][x][0] = dp[y-1][x+dx][0];
							dp[y][x][1] = dp[y-1][x+dx][1];
						} else if(dp[y][x][0] == dp[y-1][x+dx][0] && dp[y][x][1] < dp[y-1][x+dx][1]) {
							dp[y][x][0] = dp[y-1][x+dx][0];
							dp[y][x][1] = dp[y-1][x+dx][1];
						}
					}
				}
				if(ansn < dp[y][x][0]) {
					ansn = dp[y][x][0];
					ansp = dp[y][x][1];
				} else if(ansn == dp[y][x][0]) {
					ansp = max(ansp, dp[y][x][1]);
				}
//				debug(x, y, map[y][x], dp[y][x][0], dp[y][x][1]);
			}
			
			System.out.println(ansn + " " + ansp);
		}

	}
	
	int[] dx = {1,0,-1,0}, dy = {0,-1,0,1};
	void pre() {
		p2ind = new HashMap<Integer, P>();
		map = new int[MAX][MAX]; dp = new int[MAX][MAX][2];
		for(int[] a: map) fill(a, INF);
		
		prime = new boolean[M+1];
		prime[0] = prime[1] = true;
		for(int i=2;i<=M;i++) if(!prime[i]) 
			for(int j=i*2;j<=M;j+=i) prime[j] = true;
		
		int ind = 1, len=0, x = MAX/2, y = MAX/2, d=0;
		while(true) {
			len++;
			for(int c=0;c<2;c++) {
				for(int i=0;i<len;i++) {
					map[y][x] = ind; p2ind.put(ind, new P(x, y));
					ind++; x += dx[d]; y += dy[d];
				}
				d = (d+1)&3;
			}
			if(ind > M) break;
		}
		
/*		for(int sy=MAX/2-10;sy<=MAX/2+10;sy++) for(int sx=MAX/2-10;sx<=MAX/2+10;sx++) {
			System.out.printf("%4d%s", map[sy][sx], sx==MAX/2+10? "\n": "");
		}*/
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x; this.y = y;
		}
		
		public int hashCode() {
			return x * 100000 + y;
		}
		
		public boolean compareTo(Object o) {
			if(o instanceof P) {
				P p = (P)o;
				return x == p.x && y == p.y;
			}
			return false;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}