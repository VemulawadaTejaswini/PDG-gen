import java.io.*;
import java.util.*;
class Main{
	static final double EPS = 0.00000000001;
    static final int COUNTER_CLOCKWISE = 1;
    static final int CLOCKWISE = -1;
    static final int ONLINE_BACK = 2;
    static final int ONLINE_FRONT = -2;
    static final int ON_SEGMENT = 0;

	private static List<Point> hull = new ArrayList<>();

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		// Create list of points from input
		Point[] points = new Point[n];
		for(int i = 0; i < n; i++) {
			points[i] = new Point(scanner.nextInt(), scanner.nextInt());
		}
		scanner.close();

		Arrays.sort(points, new SortPoint());
		findHull(points, n);
	}

	private static int orientation(Point p0, Point p1, Point p2){
		Point a = vec(p0, p1);
        Point b = vec(p0, p2);
        if(cross(a, b) > EPS) return COUNTER_CLOCKWISE;
        if(cross(a, b) < EPS) return CLOCKWISE;
        if(dot(a, b) < EPS) return ONLINE_BACK;
        if(norm(a) < norm(b)) return ONLINE_FRONT;
        return ON_SEGMENT;
	}

	public static void findHull(Point points[], int n) {
		List<Point> u = new ArrayList<Point>();
		List<Point> l = new ArrayList<Point>();

		if (n < 3) return;

		u.add(points[0]);
		u.add(points[1]);

		l.add(points[n-1]);
		l.add(points[n-2]);

		for (int i = 2; i < n; i++) {
			for (int j = u.size(); j >= 2 && orientation(u.get(j-2), u.get(j-1), points[i]) != CLOCKWISE; j--) {
				u.remove(u.size() - 1);
			}
			u.add(points[i]);
		}

		for (int i = n-3; i >= 0; i--) {
			for (int j = l.size(); j >= 2 && orientation(l.get(j-2), l.get(j-1), points[i]) != CLOCKWISE; j--) {
				l.remove(l.size() - 1);
			}
			l.add(points[i]);
		}

		Collections.reverse(l);
		for (int i = u.size() - 2; i >= 1; i--) {
			l.add(u.get(i));
		}

		System.out.println(l.size());
		for (Point p : l) {
			System.out.println(p);
		}
	}

	static double norm(Point p) {
		return p.x * p.x + p.y * p.y;
	}
	static Point vec(Point p1, Point p2) {
		return new Point(p2.x - p1.x, p2.y - p1.y);
	}
	static double dot(Point u, Point v) {
		return u.x * v.x + u.y * v.y;
	}
	static double cross(Point u, Point v) {
		return u.x * v.y - u.y * v.x;
	}
	
}
class Point{
	int x;
	int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return x + " " + y;
	}
}

class SortPoint implements Comparator<Point> {
	public int compare(Point p1, Point p2) {
		if (p1.y < p2.y)
			return -1;
		else if (p1.y == p2.y) {
			if (p1.x < p2.x)
				return -1;
			else if (p1.x == p2.x)
				return 0;
			else
				return 1;
		} else return 1;
	}
}


