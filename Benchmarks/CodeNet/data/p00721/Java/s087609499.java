
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	boolean map[][];
	P s;
	LinkedList<P> dusts;
	P[] da;
	int[][] d;
	int size;
	int[] mem;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			map = new boolean[h+2][w+2];
			dusts = new LinkedList<P>();
			for(int i=1;i<=h;i++) {
				String str = sc.next();
				for(int j=1;j<=w;j++) {
					switch (str.charAt(j-1)) {
					case '*' :
						dusts.add(new P(j, i));
						map[i][j] = true;
						break;
					case 'x':
						map[i][j] = false;
						break;
					case 'o':
						s = new P(i, j);
						map[i][j] = true;
						break;
					case '.':
						map[i][j] = true;
					}
				}
			}
			size = dusts.size();
			
			da = new P[size+1];
			da[0] = s;
			for(int i=1;i<=size;i++) da[i] = dusts.remove();
			d = new int[size+1][size+1];
			boolean flg = true;
			
			for(int i=0;i<size+1;i++) for(int j=i+1;j<size+1;j++) {
				d[i][j] = d[j][i] = bfs(da[i], da[j]);
				if(d[i][j] == INF ) flg = false;
			}
			if(!flg) {
				System.out.println(-1);
				continue;
			}
			
			mem = new int[1<<(size+1)];
			fill(mem, -1);
			System.out.println( solve( (1<<(size+1)) - 1, 0 ) );
		}
	}
	
	int solve(int S, int node) {
		if( mem[S] >= 0 ) return mem[S];
		if( S == 0 ) return mem[S] = 0;
		int t = INF;
		for(int i=0;i<size+1;i++) {
			if( ((S>>i)&1) == 1 ) {
				t = min(t, solve(S-(1<<i), i) + d[node][i] );
			}
		}
		
		return mem[S] = t;
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	int bfs(P s, P t) {
		boolean[][] tmp = new boolean[h+2][w+2];
		for(int i=0;i<h+2;i++) for(int j=0;j<w+2;j++)
			tmp[i][j] = map[i][j];
		P now = new P(s.x, s.y);
		LinkedList<P> que = new LinkedList<P>();
		que.add(now);
		for( ;!que.isEmpty(); ) {
			now = que.removeFirst();
			if( now.x == t.x && now.y == t.y ) return now.cnt;
			tmp[now.y][now.x] = false;
			for(int i=0;i<4;i++) {
				if( tmp[now.y+dy[i]][now.x+dx[i]] ) 
					que.addLast(new P(now.x + dx[i], now.y + dy[i], now.cnt + 1));
			}
		}
		return INF;
	}
	
	class P {
		int x, y, cnt;
		P(int x, int y) {
			this.x = x;
			this.y = y;
			cnt = 0;
		}
		P(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}