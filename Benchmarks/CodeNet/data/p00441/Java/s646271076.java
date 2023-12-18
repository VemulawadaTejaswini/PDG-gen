import java.util.*;

public class Main {

	int sq(int x){ return x*x; }

	class Point{
		int x, y;
		Point(int _x, int _y){
			this.x = _x;
			this.y = _y;
		}
		public boolean equals(Object a){
			return (a instanceof Point) && this.x == ((Point)a).x && this.y == ((Point)a).y;
		}
		public int hashCode(){
			return x*x ^12345678 - y*y;
		}
	}

	Point ps[];
	int N;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N == 0) return ;
			ps = new Point[N];
			for(int i=0; i<N; i++){
				int x = in.nextInt(), y = in.nextInt();
				ps[i] = new Point(x<<1, y<<1);
			}
			System.out.println(solve()>>2);
		}
	}

	int solve(){
		HashSet<Point> set = new HashSet<Point>();
		for(int i=0; i<N; i++){
			set.add(ps[i]);
		}
		int ret = 0;
		for(int i=0; i<N; i++)for(int j=i+1; j<N; j++){
			Point V = new Point((ps[j].x - ps[i].x)>>1, (ps[j].y - ps[i].y)>>1);
			Point C = new Point(ps[i].x + V.x, ps[i].y + V.y);
			Point L = new Point(C.x-V.y, C.y+V.x), R = new Point(C.x+V.y, C.y-V.x);
			if(set.contains(L) && set.contains(R)){
				ret = Math.max(ret, sq(ps[i].x - L.x) + sq(ps[i].y - L.y));
			}
		}
		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}