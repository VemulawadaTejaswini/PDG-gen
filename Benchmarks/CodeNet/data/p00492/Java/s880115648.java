
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int map[][];
	int w, h;
	void run() {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		h = sc.nextInt();
		map = new int[h+2][w+2];
		for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
			map[i][j] = sc.nextInt();
		}
		bfs(0, 0);
//		for(int[] a: map) debug(a);
		int cnt = 0;
		for(int i=0;i<h+2;i++) for(int j=0;j<w+2;j++) {
			for(int k=2;k<5;k++) if( allow(j+dx[i%2][k], i+dy[i%2][k]) && map[i][j] + map[i+dy[i%2][k]][j+dx[i%2][k]] == 3 ) 
				cnt++;
		}
		System.out.println(cnt);
	}
	int dx[][] = {{-1,0,1,0,-1,-1}, {0,1,1,1,0,-1}};
	int dy[][] = {{-1,-1,0,1,1,0},{-1,-1,0,1,1,0}};
	void bfs(int sx, int sy) {
		LinkedList<P> que = new LinkedList<P>();
		que.add(new P(sx, sy));
		for(;!que.isEmpty();) {
			P p = que.removeFirst();
			int x = p.x;
			int y = p.y;
			for(int i=0;i<6;i++) {
				if( allow(x+dx[y%2][i], y+dy[y%2][i]) && map[y+dy[y%2][i]][x+dx[y%2][i]] == 0 ) {
					map[y+dy[y%2][i]][x+dx[y%2][i]] = 2;
					que.add(new P(x+dx[y%2][i], y+dy[y%2][i]));
				}
			}
		}
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;this.y =y;
		}
	}
	
	boolean allow(int x, int y) {
		return !(x < 0 || y < 0 || x >= w+2 || y >= h+2 );
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}