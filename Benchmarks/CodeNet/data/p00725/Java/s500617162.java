
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	P s, g;
	int map[][];

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0) break;
			map = new int[h+2][w+2];
			for(int[] a: map) fill(a, -1);
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				int s = sc.nextInt();
				if( s == 2 ) {
					map[i][j] = 0;
					this.s = new P(j,i,0);
				}
				else if( s == 3 ) {
					map[i][j] = 0;
					this.g = new P(j, i, 0);
				}
				else map[i][j] = s;
			}
			System.out.println(bfs());
		}
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	int bfs() {
		LinkedList<Pair> que = new LinkedList<Pair>();
		Pair now = new Pair(s);
		que.add(now);
		for(;!que.isEmpty();) {
			now = que.removeFirst();
			if(isGoal(now.p)) return now.p.cnt;
			if(now.p.cnt == 10 ) continue;
			for(int i=0;i<4;i++) {
				if( !now.del.contains(new P(now.p.x + dx[i], now.p.y+dy[i], 0)) && (
						map[now.p.y+dy[i]][now.p.x+dx[i]] == -1 || map[now.p.y+dy[i]][now.p.x+dx[i]] == 1 ) )
					continue;
				int sdx = dx[i];
				int sdy = dy[i];
				while(  now.del.contains(new P(now.p.x+sdx, now.p.y+sdy, 0)) || ( 
						map[now.p.y+sdy][now.p.x+sdx] != -1 && map[now.p.y+sdy][now.p.x+sdx] != 1 ) ) {
					if(isGoal(now.p.x + sdx, now.p.y+sdy)) {
						que.addLast(new Pair( new P(now.p.x+sdx, now.p.y+sdy, now.p.cnt+1), now.del));
						break;
					}
					sdx += dx[i];
					sdy += dy[i];
				}
				if(map[now.p.y+sdy][now.p.x+sdx] == 1) {
					LinkedList<P> tmp = new LinkedList<P>(now.del);
					tmp.add(new P(now.p.x+sdx, now.p.y+sdy, 0));
					que.add(new Pair( new P(now.p.x+sdx-dx[i], now.p.y+sdy-dy[i], now.p.cnt+1), tmp));
				}
			}
		}
		
		return -1;
	}
	
	boolean isGoal(P p) {
		return p.x == g.x && p.y == g.y;
	}
	boolean isGoal(int x, int y) {
		return x == g.x && y == g.y;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
	
	class Pair {
		LinkedList<P> del = new LinkedList<P>();
		P p;
		Pair( P p) {
			this.p = new P(p);
		}
		Pair (P p, LinkedList<P> del) {
			this.p = new P(p);
			for(P tmp: del) this.del.add(tmp);
		}
	}
	
	class P {
		int x, y, cnt;
		P(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
		P (P p) {
			x = p.x;
			y = p.y;
			cnt = p.cnt;
		}
		@Override
		public boolean equals(Object o) {
			if(o instanceof P) {
				P p = (P) o;
				return x == p.x && y == p.y;
			}
			return false;
		}
	}
}