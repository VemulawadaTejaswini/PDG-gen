import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1165().doIt();
	}

	class AOJ1165{
		int n;

		void solve(){
			boolean[][] map = new boolean[1000][1000];
			Point2D p[] = new Point2D[n];
			p[0] = new Point2D.Double(500,500);
			map[500][500] = true;
			int sx[] = {-1,0,1,0};
			int sy[] = {0,1,0,-1};
			for(int i=1;i<n;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				int nx = (int)p[a].getX()+sx[b];
				int ny = (int)p[a].getY()+sy[b];
				p[i] = new Point2D.Double(nx, ny);
				map[ny][nx] = true;
			}
//			System.out.println(Arrays.toString(p));
			int w=0,h=0;
			int w2=Integer.MAX_VALUE,h2=Integer.MAX_VALUE;
			for(int i=0;i<p.length;i++){
				int x = (int)p[i].getX();
				int y = (int)p[i].getY();
				w = Math.max(w, x);
				h = Math.max(h, y);
				w2 = Math.min(w2, x);
				h2 = Math.min(h2, y);
			}
//			System.out.println(w+" "+h);
//			System.out.println(w2+" "+h2);
			System.out.println((w-w2+1)+" "+(h-h2+1));
		}

		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				solve();
			}
		}
	}

}