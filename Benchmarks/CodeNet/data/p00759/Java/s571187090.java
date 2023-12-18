
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	boolean map[][][];
	int dp[][][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			h = sc.nextInt();
			w = sc.nextInt();
			if( (h|w) == 0 ) break;
			
			map = new boolean[h][w][4];
			dp = new int[h][w][4];
			for(int i=0;i<2*h-1;i++) for(int j=0;j<(i%2==0? w-1:w);j++){
				map[i/2][j][i%2==0? 2:3] = sc.nextInt() == 0;
			}
			
			for(int i=1;i<h;i++) for(int j=0;j<w;j++)
				map[i][j][1] = map[i-1][j][3];
			
			for(int i=0;i<h;i++) for(int j=1;j<w;j++)
				map[i][j][0] = map[i][j-1][2];
			
//			for(boolean[][] a: map) debug(a);
			
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) {
				for(int k=0;k<4;k++) if(map[i][j][k]){
					map[i][j][k] = false;
					dp[i][j][k] = bfs(j, i);
					map[i][j][k] = true;
				}
			}
			
			System.out.println(dijkstra());
		}
	}
	
	int dijkstra() {
		int[][] c = new int[h][w];
		for(int[] a: c) fill(a, INF);
		c[h-1][w-1] = 0;
		
		PriorityQueue<P> que= new PriorityQueue<P>();
		que.add(new P(w-1, h-1, 0));
		
		for(;!que.isEmpty();) {
			P now = que.remove();
//			debug(now.x, now.y, now.c);
			if( (now.x|now.y) == 0 ) return now.c;
			if( now.c != c[now.y][now.x] ) continue;
			for(int i=0;i<4;i++) if(map[now.y][now.x][i]){
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				int nc = now.c + 1;
				nc = max(nc, dp[ny][nx][(i+2)%4]);
//				debug(dp[ny][nx][(i+2)%4], c[ny][nx]);
				if(c[ny][nx] <= nc ) continue;
				c[ny][nx] = nc;
				que.add(new P(nx, ny, nc));
			}
		}
		return -1;
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	int bfs(int x, int y) {
		boolean visited[][] = new boolean[h][w];
		LinkedList<P> que = new LinkedList<P>();
		
		que.add(new P(x, y, 0));
		visited[y][x] = true;
		
		for(;!que.isEmpty();) {
			P now = que.removeFirst();
			if( now.x == w-1 && now.y == h-1 ) return now.c;
			for(int i=0;i<4;i++) if(map[now.y][now.x][i] && !visited[now.y+dy[i]][now.x+dx[i]]) {
				que.addLast(new P(now.x + dx[i], now.y+dy[i], now.c+1));
				visited[now.y+dy[i]][now.x+dx[i]] = true;
			}
		}
		
		return INF;
	}
	
	class P implements Comparable<P>{
		int x, y, c;
		P(int x, int y, int c) {
			this.x = x;
			this.y = y;
			this.c = c;
		}
		@Override
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			return c-o.c;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}