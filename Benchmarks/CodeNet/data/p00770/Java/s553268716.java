
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int MAX = 1002;
	int OFS = MAX / 2;
	int[][] index;
	HashMap<Integer, P> ind2P;
	boolean[] p;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		ind2P = new HashMap<Integer, P>();
		index = new int[MAX][MAX];
		p = new boolean[MAX*MAX + 1];
		
		prime(); create();
		
		for(;;) {
			int m = sc.nextInt(), n = sc.nextInt();
			if( (m|n) == 0 ) break;
			
			int[][] dp1 = new int[MAX][MAX];
			int[][] dp2 = new int[MAX][MAX];
			for(int[] a: dp1) fill(a, -1);
			
			P s = ind2P.get(n);
			dp1[s.y][s.x] = !p[n]? 1:0; dp2[s.y][s.x] = !p[n]? n:0;
			int max = dp1[s.y][s.x], last = dp2[s.y][s.x];
			for(int y=0;y<MAX;y++) for(int x=0;x<MAX;x++) if(dp1[y][x]>=0){
				for(int i=-1;i<=1;i++) {
					int sx = x+i, sy = y+1;
					if(out(sx, sy)) continue;
					int v = index[sy][sx];
					if( v > m ) continue;
					if(dp1[sy][sx] == dp1[y][x] + (!p[v]? 1: 0)) {
						dp2[sy][sx] = max(dp2[sy][sx], v);
					}
					else if(dp1[sy][sx] < dp1[y][x] + (!p[v]? 1: 0)) {
						dp1[sy][sx] = dp1[y][x] + (!p[v]? 1: 0);
						dp2[sy][sx] = !p[v]? v:dp2[y][x];
					}
					if( max == dp1[sy][sx]) {
						last = max(last, dp2[sy][sx]);
					}
					else if(max < dp1[sy][sx]) {
						max = dp1[sy][sx];
						last = dp2[sy][sx];
					}
				}
			}
			System.out.println(max + " " + last);
		}
	}
	
	boolean out(int x, int y) {
		return x<0 || y < 0 || x >= MAX || y >= MAX;
	}
	
	int[] dx = {1,0,-1,0}, dy = {0,-1,0,1};
	void create() {
		int p = 1, d = 0, len = 1;
		int x = OFS-1, y = OFS;
		
		for(;;) {
			for(int cnt=0;cnt<2;cnt++) {
				for(int l=0;l<len;l++){
					index[y][x] = p;
					ind2P.put(p++, new P(x, y));
					x += dx[d]; y += dy[d];
					if( p == MAX*MAX ) return;
				}
				d = (d+1)&3;
			}
			len++;
		}
	}
	
	void prime() {
		p[0] = p[1] = true;
		for(int i=2;i<=MAX*MAX;i++) if(!p[i]) 
			for(int j=2*i;j<=MAX*MAX;j+=i) p[j] = true;
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}