import java.util.Arrays;
import java.util.Scanner;

//Autumnal Illumination
public class Main{

	static final double EPS = 1.0e-8;
	static double norm(Point p) {
		return Math.hypot(p.x, p.y);
	}
	static double inp(Point p1, Point p2) {
		return p1.x*p2.x + p1.y*p2.y;
	}
	static double extp(Point p1, Point p2) {
		return p1.x*p2.y - p2.x*p1.y;
	}
	static Point proj(Line l, Point p) {
		double t = inp(sub(p, l.s), sub(l.s, l.t)) / Math.pow(norm(sub(l.s, l.t)),2);
		Point tp = sub(l.s, l.t);
		return new Point(l.s.x + t*tp.x, l.s.y + t*tp.y);
	}
	static Point sub(Point p1, Point p2) {
		return new Point(p1.x-p2.x, p1.y-p2.y);
	}
	static class Point {
		public double x;
		public double y;
		public Point(double x_, double y_) {
			x = x_; y=y_;
		}
	}
	static class Line {
		public Point s,t;
		public Line(Point s_, Point t_) {
			s = s_; t = t_;
		}
	}

	static int ccw(Point a, Point b, Point c) {
		Point p = sub(b, a);
		Point q = sub(c, a);
		if(extp(p, q) > EPS) return 1;		// counter clockwise
		if(extp(p, q) < -EPS)return -1;		// clockwise
		if(inp(p, q) < -EPS) return 2;		// c--a--b on line
		if(Math.abs(norm(p) - norm(q)) < EPS) return -2;	// a--b--c on line
		return 0;				// a--c--b(or a--c=b) on line 
	}
	
	static boolean intersectSS(Line s, Line t) {
		return ccw(s.s,s.t,t.s)*ccw(s.s,s.t,t.t) <= 0 &&
		ccw(t.s,t.t,s.s)*ccw(t.s,t.t,s.t) <= 0;
	}

	static boolean col(int[][] p, int[][] q){
		for(int i=0;i<4;i++){
			boolean right = true;
			for(int j=0;j<4;j++){
				int x1 = p[(j+1)%4][0]-p[j][0];
				int y1 = p[(j+1)%4][1]-p[j][1];
				int x2 = q[i][0]-p[j][0];
				int y2 = q[i][1]-p[j][1];
				if(x1*y2-x2*y1>0){
					right = false;
					break;
				}
			}
			if(right)return true;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				Line l1 = new Line(new Point(p[i][0],p[i][1]), new Point(p[(i+1)%4][0], p[(i+1)%4][1]));
				Line l2 = new Line(new Point(q[j][0],q[j][1]), new Point(q[(j+1)%4][0], q[(j+1)%4][1]));
				if(intersectSS(l1, l2))return true;
			}
		}
		return false;
	}

	static class UnionFind {
		final int[] tree;
		int num;
		public UnionFind(int n) {
			this.tree = new int[n];
			Arrays.fill(tree, -1);
			num=n;
		}

		// merge the set contains x and the set contains y
		void union(int x, int y) {
			x = root(x);
			y = root(y);
			if(x != y) {
				if(tree[x] < tree[y]) {
					x ^= y; y ^= x; x^= y;
				}
				tree[x] += tree[y];
				tree[y] = x;
				num--;
			}
		}
		// decide if x and y belong to the same set
		boolean find(int x, int y) {
			return root(x) == root(y);
		}
		int root(int x) {
			return tree[x] < 0 ? x : (tree[x] = root(tree[x]));
		}
		// return size of the set contains x
		int size(int x) {
			return -tree[root(x)];
		}
		// return the number of sets
		int getNum() {
			return num;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			while(n--!=0){
				int m = sc.nextInt();
				int[][][] p = new int[m][4][2];
				for(int i=0;i<m;i++){
					for(int j=0;j<4;j++){
						for(int k=0;k<2;k++){
							p[i][j][k]=sc.nextInt();
						}
					}
				}
				UnionFind u = new UnionFind(m);
				for(int i=0;i<m;i++){
					for(int j=0;j<m;j++){
						if(!u.find(i, j)&&col(p[i], p[j]))u.union(i, j);
					}
				}
				System.out.println(u.num);
			}
		}
	}
}