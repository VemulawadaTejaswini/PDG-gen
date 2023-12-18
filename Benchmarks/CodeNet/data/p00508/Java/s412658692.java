import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

	static class Point {
		int x;
		int y;
		double r;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			this.r = Math.sqrt(x*x + y*y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Point> points = new ArrayList<Point>();

		int N = sc.nextInt();
		for (int i = 0 ; i < N ; i++) {
			points.add(new Point(sc.nextInt(), sc.nextInt()));
		}

		Collections.sort(points, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return (int) (o1.r - o2.r);
			}
		});

		System.gc();
		double D = Double.MAX_VALUE;
		for (int i = 0 ; i < N-1 ; i++) {
			Point pi = points.get(i);
			for (int j = i+1 ; j < N ; j++) {
				Point pj = points.get(j);
				if ((pj.r - pi.r)*(pj.r - pi.r) >= D) continue;
				double d = (pj.x-pi.x)*(pj.x-pi.x) + (pj.y-pi.y)*(pj.y-pi.y);
				if (d < D) D = d;
			}
		}
		System.out.println(String.format("%.0f", D));

	}
}