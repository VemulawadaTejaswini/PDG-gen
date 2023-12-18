import java.util.*;

public class Main {
	static class Point{
		int x, y, zero;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			zero = manhattan(0, 0);
		}
		public int manhattan(Point p) {
			int tmpx = Math.abs(this.x - p.x);
			int tmpy = Math.abs(this.y - p.y);
			return tmpx + tmpy;
		}
		public int manhattan(int x, int y) {
			int tmpx = Math.abs(this.x - x);
			int tmpy = Math.abs(this.y - y);
			return tmpx + tmpy;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point p[] = new Point[n];
		for(int i = 0; i < n; ++i){
			p[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		sc.close();
		Point zero = new Point(0, 0);
		Arrays.sort(p, new Comparator<Point>() {
			public int compare(Point o1, Point o2) {
				int ans = o1.zero - o2.zero;
				return ans;
			}
		});
		int ans = p[0].manhattan(p[n - 1]);
		System.out.println(ans);
	}
}
