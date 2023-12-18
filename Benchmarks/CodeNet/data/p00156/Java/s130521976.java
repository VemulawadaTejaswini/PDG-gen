
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int WALL = 10000;
	int GOAL = 100000;
	int w, h;
	int map[][];
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			map = new int[h+2][w+2];
			for(int i=1;i<=h;i++) {
				String str = sc.next();
				for(int j=1;j<=w;j++) { 
					switch (str.charAt(j-1)) {
					case '#': map[i][j] = WALL; break;
					case '&': map[i][j] = GOAL; break;
					}
				}
			}

			int c=1;
			
			System.out.println(bfs());
		}
	}
	
	int dx[] ={-1,0,1,0};
	int dy[] ={0,-1,0,1};
	
	int bfs() {
		PriorityQueue<P> que = new PriorityQueue<P>();
		que.add(new P(0,0,0,false));
		map[0][0] = INF;
		
		for(;;) {
			P now = que.remove();
//			debug(now.x, now.y);
			for(int i=0;i<4;i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if( nx < 0 || nx >= w+2 || ny < 0 || ny >= h+2 ) continue;
				
				if( map[ny][nx] < WALL ) {
					map[ny][nx] = INF;
					que.add(new P(nx,ny,now.c,false));
				}
				else if(map[ny][nx] == WALL) {
					map[ny][nx] = INF;
					que.add(new P(nx,ny,now.c+(now.isWall? 0:1),true));
				}
				else if(map[ny][nx] == GOAL) return now.c;
			}
		}
	}
	
	class P implements Comparable<P>{
		int x, y, c;
		boolean isWall;
		P(int x, int y, int c, boolean w) {
			this.x = x;
			this.y = y;
			this.c = c;
			isWall = w;
		}
		@Override
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			if(c != o.c)
				return c-o.c;
			return isWall? -1:1;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}