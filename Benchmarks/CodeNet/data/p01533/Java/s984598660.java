
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int w, h;
	int[][] map;
	P S, G;
	P[] M;
	void run() {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt(); h = sc.nextInt();
		map = new int[h+2][w+2];
		LinkedList<P> m = new LinkedList<P>();
		for(int i=1;i<=h;i++) {
			String l = sc.next();
			for(int j=0;j<w;j++) {
				map[i][j+1] = max(map[i][j+1], 1);
				if(l.charAt(j) == 'G') G = new P(j+1, i);
				if(l.charAt(j) == 'S') S = new P(j+1, i);
				if(l.charAt(j) == 'M') m.add(new P(j+1, i));
				if(l.charAt(j) == '#') {
					for(int x=-2;x<=2;x++) for(int y=-2;y<=2;y++) if((x|y)!=0) {
						if( j+x+1<1 || j+x+1>w || i+y<1 || i+y>h ) continue;
						map[i+y][j+x+1] = max(map[i+y][j+x+1], 4-max(abs(y), abs(x)));
					}
					map[i][j+1] = INF;
				}
			}
		}
		m.addFirst(S); m.addLast(G);
		M = m.toArray(new P[]{});
		solve();
	}
	
	int m;
	void solve() {
		m = M.length;
		d = new int[m][m];
//		debug(map);
		for(int i=0;i<m;i++) for(int j=i+1;j<m;j++) {
			d[i][j] = d[j][i] = bfs(M[i], M[j]);
		}
//		debug(d);
		mem = new int[1<<(m-1)][m];
		for(int[] a: mem) fill(a, -1);
		System.out.println(dfs(1, 0));
	}
	int[][] d;
	int[][] mem;
	int dfs(int S, int p) {
		if(mem[S][p] >= 0) return mem[S][p];
		if( S == (1<<(m-1))-1) return mem[S][p] = d[p][m-1];
		int t = INF;
		for(int i=0;i<m-1;i++) if(((S>>i)&1) == 0) {
			t = min(t, dfs(S|(1<<i), i)+d[p][i]);
		}
		return mem[S][p] = t;
	}
	
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, -1, 0, 1};
	int bfs(P s, P g) {
		boolean[][] visited = new boolean[h+2][w+2];
		PriorityQueue<P> q = new PriorityQueue<P>();
		q.add(s); visited[s.y][s.x] = true;
		for(;!q.isEmpty();) {
			P cur = q.remove();
			if(cur.x == g.x && cur.y == g.y) return cur.t;
			if(map[cur.y][cur.x] == 0 || map[cur.y][cur.x] == INF) continue;
			for(int i=0;i<4;i++) if(!visited[cur.y+dy[i]][cur.x+dx[i]]){
				visited[cur.y+dy[i]][cur.x+dx[i]] = true;
				q.add(new P(cur.x+dx[i], cur.y+dy[i], cur.t+map[cur.y][cur.x]));
			}
		}
		
		return -1;
	}
	
	class P implements Comparable<P>{
		int x, y, t;
		P(int x, int y) {
			this.x = x;
			this.y = y;
			t = 0;
		}
		P(int x, int y, int t) {
			this.x = x;
			this.y = y;
			this.t = t;
		}
		@Override
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			return t-o.t;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}