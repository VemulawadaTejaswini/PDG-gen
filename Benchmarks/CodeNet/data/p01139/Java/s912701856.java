
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {
	
	int w, h;
	int[][] W, B;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			W = new int[h+2][w+2];
			B = new int[h+2][w+2];
			
			for(int[] a: W) fill(a, 1);
			for(int[] a: B) fill(a, -1);
			
			boolean flg = false;
			for(int i=1;i<=h;i++) {
				String str = sc.next();
				for(int j=1;j<=w;j++) {
					if( str.charAt(j-1) == 'W' ) { flg = true; W[i][j] = B[i][j] = 1; }
					else if( str.charAt(j-1) == 'B' ) { flg = true; W[i][j] = B[i][j] = -1;}
					else W[i][j] = B[i][j] = 0;
				}
			}
			
			int wc = 0, bc = 0;
			
			if(flg)
			for(int i=1;i<=h;i++) for(int j=1;j<=w;j++) {
				int c = 0;
				if( W[i][j] == 0 ) c = dfs(j,i,1, W);
				if(c != 0) debug( j, i, c, "W" );
				wc += max(c, 0);
				c  = 0;
				if( B[i][j] == 0 ) c = dfs(j,i,-1, B);
				if(c != 0) debug(j, i, c, "B");
				bc += max(c, 0);
			}
			
///			for(int[] a: W) debug(a);
//			for(int[] a: B) debug(a);
			
			System.out.println(bc + " " + wc);
		}
	}
	
	int[] dx = {-1,0,1,0};
	int[] dy = {0,-1,0,1};
	
	int dfs(int x, int y, int c, int[][] map) {
		if( map[y][x] == -c ) return -1;
		map[y][x] = c;
		
		int cnt = 1;
		for(int i=0;i<4;i++) if( map[y+dy[i]][x+dx[i]] != c ) {
			int cc = dfs(x+dx[i], y+dy[i], c, map);
			if( cc == -1 ) {cnt = -1; }
			if( cnt != -1 ) cnt += cc;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	void debug( Object... o ) {
//		System.err.println(deepToString(o));
	}
	
}