
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int w, h;
	boolean[][] mapl, mapr;
	byte sxl, syl, sxr, syr;
	byte gxl, gyl, gxr, gyr;
	
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
						gxl = (byte)j;
						gyl = (byte)i;
						mapl[i][j] = true;
						break;
					case 'L':
						sxl = (byte)j;
						syl = (byte)i;
						mapl[i][j] = true;
						break;
					case '.':
						mapl[i][j] = true;
						break;
					default :mapl[i][j] = false;
					}
					
					switch (r.charAt(j-1)) {
					case '%':
						gxr = (byte)j;
						gyr = (byte)i;
						mapr[i][j] = true;
						break;
					case 'R':
						sxr = (byte)j;
						syr = (byte)i;
						mapr[i][j] = true;
						break;
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
	
	byte dx[] = {-1,0,1,0};
	byte dy[] = {0,-1,0,1}; 
	
	boolean solve() {
		boolean[][][][] visited = new boolean[h+2][w+2][h+2][w+2];
		LinkedList<W> que = new LinkedList<W>();
		W now = new W( new P((byte)sxl, (byte)syl), new P((byte)sxr, (byte)syr) );
		que.add(now);
		visited[now.l.y][now.l.x][now.r.y][now.r.x] = true;
		for(;!que.isEmpty();) {
			now = que.removeFirst();
//			debug(now.l.x, now.l.y, now.r.x, now.r.y);
			int g = isGoal(now);
			if( g == 1 ) return true;
			if( g == -1 ) continue;
			
			for(int i=0;i<4;i++) {
				byte nxl = (byte)(now.l.x + dx[i]);
				byte nyl = (byte)(now.l.y + dy[i]);
				byte nxr = (byte)(now.r.x - dx[i]);
				byte nyr = (byte)(now.r.y + dy[i]);
				if( !mapl[nyl][nxl] ) {
					nxl -= dx[i];
					nyl -= dy[i];
				}
				if( !mapr[nyr][nxr] ) {
					nxr += dx[i];
					nyr -= dy[i];
				}
				if( visited[nyl][nxl][nyr][nxr] ) continue;
				que.add( new W( new P(nxl, nyl), new P(nxr, nyr) ) );
				visited[nyl][nxl][nyr][nxr] = true;
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
			return r.hashCode() * 2500 + l.hashCode();
		}
	}
	
	class P {
		byte x, y;
		P(byte x, byte y) {
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
			return (int)x * 50 + y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}