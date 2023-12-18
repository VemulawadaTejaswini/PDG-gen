
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n;
	Polygon pol;
	Polygon pols[];
	Scanner sc;
	
	void run() {
		sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			if( n == 0 ) break;
			pols = new Polygon[n];
			pol = new Polygon(sc.nextInt());
			for(int i=0;i<n;i++) {
				pols[i] = new Polygon(sc.nextInt());
			}
			
			for(int i=0;i<n;i++) {
				if( pols[i].isSame(pol) ) System.out.println(i+1);
			}
			System.out.println("+++++");
			
		}
	}
	
	class Polygon {
		P[] lines;
		int m;
		Polygon (int m) {
			this.m = m;
			lines = new P[m];
			for(int i=0;i<m;i++) {
				lines[i] = new P(sc.nextInt(), sc.nextInt());
			}
		}
		
		int[][][] mat = { 
				{ {1,0},
				  {0,1}},
				{ {0,-1},
				  {1,0}},
				{ {-1,0},
				  {0,-1}},
				{ {0,1},
				  {-1,0}}
		};
		
		boolean isSame(Polygon pol) {
			if( m != pol.m ) return false;
			for(int i=0;i<4;i++) {
				boolean flg = true;
				for(int j=1;j<m;j++ ) {
//					debug( lines[j].sub(lines[0]).mult(mat[i]).x, lines[j].sub(lines[0]).mult(mat[i]).y );
//					debug( pol.lines[j].sub(pol.lines[0]).x, pol.lines[j].sub(pol.lines[0]).y );
					if( !lines[j].sub(lines[0]).mult(mat[i]).isEquals(pol.lines[j].sub(pol.lines[0])) ) {
						flg = false;
						break;
					}
				}
//				debug("a");
				if(flg) return true;
			}
			for(int i=0;i<4;i++) {
				boolean flg = true;
				for(int j=m-2;j>=0;j-- ) {
//					debug( lines[j].sub(lines[m-1]).mult(mat[i]).x, lines[j].sub(lines[m-1]).mult(mat[i]).y );
//					debug( pol.lines[j].sub(pol.lines[m-1]).x, pol.lines[m-j-1].sub(pol.lines[0]).y );
					if( !lines[j].sub(lines[m-1]).mult(mat[i]).isEquals(pol.lines[m-j-1].sub(pol.lines[0])) ) {
						flg = false;
						break;
					}
				}
//				debug("a");
				if(flg) return true;
			}
//			debug("aa");
			return false;
		}
	}
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		P sub(P p) {
			return new P(x-p.x, y-p.y);
		}
		
		P mult(int[][] a) {
			int s = a[0][0] * x + a[0][1] * y;
			int t = a[1][0] * x + a[1][1] * y;
			return new P(s, t);
		}
		
		boolean isEquals(P p) {
			return p.x == x && p.y == y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}