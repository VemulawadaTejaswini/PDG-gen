import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		double x1, y1, x2, y2, x3, y3, xp, yp;
		Point p1, p2, p3, pp, pc;
		Point[] tri;

		next: while (!(line = br.readLine()).isEmpty()) {
			st = new StringTokenizer(line);
			x1 = Double.parseDouble(st.nextToken());
			y1 = Double.parseDouble(st.nextToken());
			x2 = Double.parseDouble(st.nextToken());
			y2 = Double.parseDouble(st.nextToken());
			x3 = Double.parseDouble(st.nextToken());
			y3 = Double.parseDouble(st.nextToken());
			xp = Double.parseDouble(st.nextToken());
			yp = Double.parseDouble(st.nextToken());

			p1 = main.new Point(x1, y1);
			p2 = main.new Point(x2, y2);
			p3 = main.new Point(x3, y3);
			pp = main.new Point(xp, yp);
			pc = main.new Point((x1 + x2 + x3) / 3, (y1 + y2 + y3) / 3);

			tri = new Point[4];
			tri[0] = p1;
			tri[1] = p2;
			tri[2] = p3;
			tri[3] = p1;
			for (int i = 0; i < 3; i++) {
				if (liear(tri[i], tri[i + 1], pc)
						* liear(tri[i], tri[i + 1], pp) <= 0) {
					System.out.println("NO");
					continue next;
				}
			}
			System.out.println("YES");
		}
	}

	static double liear(Point p1, Point p2, Point p3) {
		return (p2.y - p1.y) * p3.x - (p2.x - p1.x) * p3.y + p2.y
				+ (p2.x - p1.x) - p2.x * (p2.y - p1.y);
	}

	class Point {
		double x, y;

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}