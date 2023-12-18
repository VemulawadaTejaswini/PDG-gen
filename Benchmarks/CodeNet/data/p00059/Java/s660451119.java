import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Intersection of Rectangles
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			Point pa1 = main.new Point();
			Point pa2 = main.new Point();
			Point pb1 = main.new Point();
			Point pb2 = main.new Point();

			pa1.x = Double.parseDouble(st.nextToken());
			pa1.y = Double.parseDouble(st.nextToken());
			pa2.x = Double.parseDouble(st.nextToken());
			pa2.y = Double.parseDouble(st.nextToken());
			pb1.x = Double.parseDouble(st.nextToken());
			pb1.y = Double.parseDouble(st.nextToken());
			pb2.x = Double.parseDouble(st.nextToken());
			pb2.y = Double.parseDouble(st.nextToken());

			Rectangle r1 = main.new Rectangle(pa1, pa2);
			Rectangle r2 = main.new Rectangle(pb1, pb2);

			if (r1.intersect(r2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

	class Point {
		double x, y;

		Point() {

		}

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	class Rectangle {

		Point[] points = new Point[4];

		Rectangle(Point p1, Point p3) {

			Point p2 = new Point(p3.x, p1.y);
			Point p4 = new Point(p1.x, p3.y);

			points[0] = p1;
			points[1] = p2;
			points[2] = p3;
			points[3] = p4;
		}

		boolean intersect(Rectangle other) {
			boolean result = false;
			if (!(result = intersect(this, other))) {
				result = intersect(other, this);
			}
			return result;
		}

		boolean intersect(Rectangle r1, Rectangle r2) {
			boolean result = false;
			for (Point p : r2.points) {
				if (r1.points[0].x <= p.x && p.x <= r1.points[2].x
						&& r1.points[0].y <= p.y && p.y <= r1.points[2].y) {
					result = true;
					break;
				}
			}
			if (!result) {
				if (r1.points[0].x <= r2.points[0].x
						&& r2.points[2].x <= r1.points[2].x
						&& r2.points[0].y <= r1.points[0].y
						&& r1.points[2].y <= r2.points[2].y) {
					result = true;
				}
			}
			if (!result) {
				if (r2.points[0].x <= r1.points[0].x
						&& r1.points[2].x <= r2.points[2].x
						&& r1.points[0].y <= r2.points[0].y
						&& r2.points[2].y <= r1.points[2].y) {
					result = true;
				}
			}
			return result;
		}

	}

}