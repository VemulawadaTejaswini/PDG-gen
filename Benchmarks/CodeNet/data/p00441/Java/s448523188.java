
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	final short MAX = 5001;
	boolean[][] map;
	HashSet<P> ps;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			short n = sc.nextShort();
			if( n==0 ) break;
			map = new boolean[MAX][MAX];
			ps = new HashSet<P>();
			for(int i=0;i<n;i++) {
				P p = new P(sc.nextShort(), sc.nextShort());
				ps.add(p);
				map[p.y][p.x] = true;
			}
			int max = 0;
//			for(P p: ps)
//				debug(p.x, p.y);
			for(P p: ps) {
				for(P q: ps) {
					max = max(max, isExist(p, q));
				}
			}
			System.out.println(max);
		}
	}
	
	int isExist(P p, P q) {
		int dx = p.x-q.x;
		int dy = p.y-q.y;
//		debug(dx, dy);
		if( isAllow(p,q, dx, dy) && (map[p.y+dx][p.x-dy] & map[q.y+dx][q.x-dy]) )return dx*dx+dy*dy;
		if( isAllow(p,q,-dx,-dy) && (map[p.y-dx][p.x+dy] & map[q.y-dx][q.x+dy]) )return dx*dx+dy*dy;
		
		return -1;
	}
	boolean isAllow(P p, P q, int dx, int dy) {
		if( p.x-dy>=0 && p.x-dy<MAX && p.y+dx>=0 && p.y+dx<MAX && 
			q.x-dy>=0 && q.x-dy<MAX && q.y+dx>=0 && q.y+dx<MAX  )
			return true;
		
		return false;
	}
	
	class P {
		short x, y;
		P(short x, short y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}