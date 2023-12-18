
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	long p;
	P ans;
	P point;
	final int offset = 10000000;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			HashSet< Long > stars = new HashSet<Long>();
			HashSet< Long > cons = new HashSet<Long>();
			int m = sc.nextInt();
			if(m == 0) break;
			p = getL(sc.nextInt(), sc.nextInt());
			point = new P(p);
			cons.add(p);
			for(int i=1;i<m;i++) {
				cons.add(getL(sc.nextInt(), sc.nextInt()));
			}
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				stars.add(getL(sc.nextInt(), sc.nextInt()));
			}
//			debug(stars);
//			debug(cons);
			for(long l: stars) {
				boolean flg = true;
				P p = getP(l);
//				debug("  ", p.x, p.y);
				for(long dl: cons) {
					P dp = getP(dl);
					dp.x = point.x-dp.x;
					dp.y = point.y-dp.y;
//					debug("   ",dp.x, dp.y, p.x-dp.x, p.y-dp.y);
//					debug("    ",l, dl, getL(p.x-dp.x, p.y-dp.y), stars.contains( getL( p.x-dp.x, p.y-dp.y )));
					if(!stars.contains( getL( p.x-dp.x, p.y-dp.y ) )) {
						flg = false;
						break;
					}
				}
				if( flg ) {
					ans = new P(p.x-point.x, p.y-point.y);
					break;
				}
			}
			System.out.println(ans.x + " " + ans.y);
		}
	}
	
	P getP(long l) {
		int x = (int)((l - l%offset)/offset);
		int y = (int)(l - x*offset);
		return new P(x, y);
	}
	
	long getL(int x, int y) {
		return (long)x * offset + y;
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		P (long l) {
			x = (int)((l - l%offset)/offset);
			y = (int)(l - x*offset);
		}
		
		@Override
		public boolean equals(Object o) {
			if( o instanceof P ) {
				P p = (P) o;
				return x == p.x && y == p.y;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}