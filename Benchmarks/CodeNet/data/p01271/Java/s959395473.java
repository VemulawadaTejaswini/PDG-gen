
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	boolean[][] mapl, mapr;
	int sxl, syl, sxr, syr;
	int gxl, gyl, gxr, gyr;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			mapl = new boolean[h+2][w+2];
			mapr = new boolean[h+2][w+2];
			
			for(int i=1;i<=h;i++) {
				String l = sc.next();
				String r = sc.next();
//				debug(l, r);
				for(int j=1;j<=w;j++) {
					switch (l.charAt(j-1)) {
					case '%':
						gxl = j;
						gyl = i;
					case 'L':
						sxl = j;
						syl = i;
					case '.':
						mapl[i][j] = true;
						break;
					default :mapl[i][j] = false;
					}
					
					switch (r.charAt(j-1)) {
					case '%':
						gxr = j;
						gyr = i;
					case 'R':
						sxr = j;
						syr = i;
					case '.':
						mapr[i][j] = true;
						break;
					default :mapr[i][j] = false;
					}
				}
			}

			if( solve() ) System.out.println("Yes");
			else System.out.println("No");
		}
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1}; 
	
	boolean solve() {
		HashSet<W> visited = new HashSet<W>();
		LinkedList<W> que = new LinkedList<W>();
		W now = new W( new P(sxl, syl), new P(sxr, syr) );
		que.add(now);
		visited.add(now);
		for(;!que.isEmpty();) {
			now = que.removeFirst();
//			debug(now.l.x, now.l.y, now.r.x, now.r.y);
			int g = isGoal(now);
			if( g == 1 ) return true;
			if( g == -1 ) continue;
			
			for(int i=0;i<4;i++) {
				int nxl = now.l.x + dx[i];
				int nyl = now.l.y + dy[i];
				int nxr = now.r.x - dx[i];
				int nyr = now.r.y + dy[i];
				if( !mapl[nyl][nxl] ) {
					nxl -= dx[i];
					nyl -= dy[i];
				}
				if( !mapr[nyr][nxr] ) {
					nxr += dx[i];
					nyr -= dy[i];
				}
				if( visited.contains(new W( new P(nxl, nyl), new P(nxr, nyr) )) ) continue;
				que.add( new W( new P(nxl, nyl), new P(nxr, nyr) ) );
				visited.add( new W( new P(nxl, nyl), new P(nxr, nyr) ) );
			}
		}
		
		return false;
	}
	
	int isGoal(W w) {
		if( w.l.equals(new P(gxl, gyl)) && w.r.equals(new P(gxr, gyr)) )
			return 1;
		if( w.l.equals(new P(gxl, gyl)) ^ w.r.equals(new P(gxr, gyr)) )
			return -1;
		else return 0;
	}
	
	class W {
		P l, r;
		W(P l, P r) {
			this.l = l;
			this.r = r;
		}
		@Override
		public boolean equals(Object o) {
			if(o instanceof W) {
				W w = (W) o;
				return l.equals(w.l) && r.equals(w.r);
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return r.hashCode() * 2500 + l.hashCode() * 2500;
		}
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof P) {
				P p = (P)o;
				return x == p.x && y == p.y;
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return x * 50 + y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}