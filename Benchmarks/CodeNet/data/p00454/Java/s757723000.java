
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean[][] f;
	int w, h;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			w = sc.nextInt();
			h = sc.nextInt();
			if( (w|h) == 0 ) break;
			
			int n = sc.nextInt();
			
			HashSet<Integer> setx = new HashSet<Integer>();
			HashSet<Integer> sety = new HashSet<Integer>();
			int[] x = new int[2*n];
			int[] y = new int[2*n];
			for(int i=0;i<2*n;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				setx.add(x[i]);
				sety.add(y[i]);
			}
			setx.add(0);
			setx.add(w);
			sety.add(0);
			sety.add(h);
				
			h = sety.size();
			w = setx.size();
			
			int[] ax = new int[w];
			int[] ay = new int[h];
			int c=0;
			for(int val: setx) ax[c++] = val;
			c = 0;
			for(int val: sety) ay[c++] = val;
			sort(ax);
			sort(ay);
			setx.clear();
			sety.clear();
			
//			debug(ax);
//			debug(ay);
//			debug(w,h);
			for(int i=0;i<2*n;i++)  {
				x[i] = binalysearch(ax, x[i]);
				
			}
			for(int i=0;i<2*n;i++) {
				y[i] = binalysearch(ay, y[i]);
			}
			ax = new int[]{};
			ay = new int[]{};
			
			f = new boolean[h-1][w-1];
	//		debug(h, w);
//			debug(x);
//			debug(y);
			for(int i=0;i<n;i++) {
				for(int xx=x[2*i];xx<x[2*i+1];xx++) for(int yy=y[2*i];yy<y[2*i+1];yy++)
					f[yy][xx] = true;
			}
//			for(boolean[] a: f) debug(a);
			int cnt = 0;
			for(int i=0;i<h-1;i++) for(int j=0;j<w-1;j++) {
	//			debug(f[i][j]);
				if(bfs(j, i)) cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	int binalysearch(int[] a, int x) {
		int l = 0, r = a.length-1;
		while(l<=r) {
			int c = (l+r)/2;
//			debug(l,r,c);
			if(a[c] > x) r = c-1;
			else if(a[c] < x) l=c+1;
			else {
				l = c;
				break;
			}
		}
		return l;
	}
	
	int dx[] = {-1,0,1,0};
	int dy[] = {0,-1,0,1};
	
	boolean bfs(int x, int y) {
//		debug(x,w,y,h);
		if( x<0 || x>=w-1 || y<0 || y>=h-1 ) return false;
//		debug("a");
		if(f[y][x]) return false;
		
		f[y][x] = true;
		LinkedList<Integer> xque = new LinkedList<Integer>();
		LinkedList<Integer> yque = new LinkedList<Integer>();
		xque.add(x);
		yque.add(y);
		while(!xque.isEmpty()) {
			int px = xque.removeFirst();
			int py = yque.removeFirst();
			for(int i=0;i<4;i++) if( !( px+dx[i]<0 || px+dx[i]>=w-1 || py+dy[i]<0 || py+dy[i]>=h-1 )
									&& !f[py+dy[i]][px+dx[i]]){
				f[py+dy[i]][px+dx[i]] = true;
				xque.addLast(px+dx[i]);
				yque.addLast(py+dy[i]);
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}