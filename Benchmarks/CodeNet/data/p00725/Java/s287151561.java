import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {
	int w, h, ans;
	int INF = 1<<28;
	boolean[][] m;
	int sx, sy, gx, gy;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt(); h = sc.nextInt();
			if( (w|h) == 0 ) break;
			m = new boolean[h][w];
			
			for(int i=0;i<h;i++) for(int j=0;j<w;j++) {
				int v = sc.nextInt();
				m[i][j] = v == 1;
				if( v == 2 ) { sx = j; sy = i; }
				if( v == 3 ) { gx = j; gy = i; }
			}
			
			ans = INF;
			dfs(sx, sy, 0);
			System.out.println((ans == INF? -1: ans));
		}
	}
	int[] dx = {0,1,0,-1};
	int[] dy = {1,0,-1,0};
	void dfs(int x, int y, int cnt) {
		if( cnt == 10 ) return;
		for(int i=0;i<4;i++) {
			int nx = x, ny = y;
			for(;;) {
				nx += dx[i]; ny += dy[i];
				if( nx == gx && ny == gy ) { ans = min(ans, cnt+1); break; }
				if( nx < 0 || ny < 0 || nx >= w || ny >= h ) break;
				if( m[ny][nx] ) {
					if(( (nx-dx[i] == x) && (ny-dy[i] == y))) break;
					m[ny][nx] = false; dfs(nx-dx[i], ny-dy[i], cnt+1); m[ny][nx] = true;
					break;
				}
			}
		}
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

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}