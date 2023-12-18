
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m) == 0) break;
			
			int[] wx = new int[n], wy = new int[n];
			int[] bx = new int[m], by = new int[m];
			
			for(int i=0;i<n;i++) {
				wx[i] = sc.nextInt(); wy[i] = sc.nextInt();
			}
			
			for(int i=0;i<m;i++) {
				bx[i] = sc.nextInt(); by[i] = sc.nextInt();
			}
			
			boolean ok = false;
			for(int i=0;i<n;i++) for(int j=0;j<m;j++) {
				boolean flg = true;
				ArrayList<P> on = new ArrayList<P>();
				
				int v = 0;
				for(int k=0;k<n;k++) {
					int tmp = cross(wx[i], wy[i], bx[j], by[j], wx[k], wy[k]);
					if(tmp == 0) on.add(new P(wx[k], wy[k], true));
					if(tmp == -v && v != 0) { flg = false; break; }
					if(tmp != 0) v = tmp;
				}
				if(!flg) continue;
				v = -v;
				for(int k=0;k<m;k++) {
					int tmp = cross(wx[i], wy[i], bx[j], by[j], bx[k], by[k]);
					if(tmp == 0) on.add(new P(bx[k], by[k], false));
					if(tmp == -v && v != 0) { flg = false; break; }
					if(tmp != 0) v = tmp;
				}
				
				if(!flg) continue;
				sort(on);
//				for(P p: on) debug(p.x, p.y, p.c);
				int cnt = 0;
				for(int k=1;k<on.size();k++) if(on.get(k).c ^ on.get(k-1).c) cnt++;
				
				if(cnt <= 1) {
					ok = true;
					break;
				}
			}
			
			System.out.println((ok? "YES": "NO"));
		}
	}
	
	int cross( int x1, int y1, int x2, int y2, int x, int y ) {
		if( (x1 - x2) * (y - y1) ==  (x - x1) * (y1 - y2)) return 0;
		return (x1 - x2) * (y - y1) < (x - x1) * (y1 - y2)? -1: 1;
	}
	
	class P implements Comparable<P> {
		int x, y; boolean c;
		P(int x, int y, boolean c) {
			this.x = x; this.y = y; this.c = c;
		}
		
		public int compareTo(P arg0) {
			// TODO 自動生成されたメソッド・スタブ
			if(x != arg0.x) return x - arg0.x;
			return y - arg0.y;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}