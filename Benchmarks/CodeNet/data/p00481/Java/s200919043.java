
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int[][] map;
	int w,h,n;
	P s;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		map = new int[h+2][w+2];
		
		for(int i=0;i<h+2;i++) fill(map[i], -1);
		for(int i=1;i<=h;i++) {
			String str = sc.next();
			for(int j=1;j<=w;j++) {
				switch (str.charAt(j-1)) {
				case('.'): map[i][j] = 0; break;
				case('X'): map[i][j] = -1; break;
				case('S'): map[i][j] = 0; s = new P(j, i, 0); break;
				default: map[i][j] = str.charAt(j-1)-'0';
				}
			}
		}
		System.out.println(bfs());
	}
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	int bfs() {
		
		P p = s;
		int ans = 0;
		
		for(int i=1;i<=n;i++) {
			boolean[][] visited = new boolean[h+2][w+2];
			LinkedList<P> que = new LinkedList<P>();
			que.add(p);
			for(;!que.isEmpty();) {
				p = que.removeFirst();
				if(map[p.y][p.x] == i) break;
				for(int j=0;j<4;j++) {
					if( !visited[p.y+dy[j]][p.x+dx[j]] && map[p.y+dy[j]][p.x+dx[j]] >= 0 ) {
						que.addLast(new P(p.x+dx[j], p.y+dy[j], p.c+1));
						visited[p.y+dy[j]][p.x+dx[j]] = true;
					}
				}
			}
			ans += p.c;
			p.c = 0;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class P {
		int x, y, c;
		P(int x, int y, int c) {
			this.x = x;
			this.y = y;
			this.c = c;
		}
	}
}