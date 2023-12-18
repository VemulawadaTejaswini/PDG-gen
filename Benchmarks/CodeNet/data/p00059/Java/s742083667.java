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

			double xa1 = Double.parseDouble(st.nextToken());
			double ya1 = Double.parseDouble(st.nextToken());
			double xa2 = Double.parseDouble(st.nextToken());
			double ya2 = Double.parseDouble(st.nextToken());

			double xb1 = Double.parseDouble(st.nextToken());
			double yb1 = Double.parseDouble(st.nextToken());
			double xb2 = Double.parseDouble(st.nextToken());
			double yb2 = Double.parseDouble(st.nextToken());

			Rectangle r1 = main.new Rectangle(xa1, ya1, xa2, ya2);
			Rectangle r2 = main.new Rectangle(xb1, yb1, xb2, yb2);

			if (r1.intersect(r2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

	class Rectangle {

		double top, bottom, left, right;

		Rectangle(double... p) {
			left = p[0];
			bottom = p[1];
			right = p[2];
			top = p[3];
		}

		boolean intersect(Rectangle other) {
			if (intersect(this, other)) {
				return true;
			} else {
				return intersect(other, this);
			}
		}

		boolean intersect(Rectangle r1, Rectangle r2) {
			if (((r1.left <= r2.left && r2.left <= r1.right) || (r1.left <= r2.right && r2.right <= r1.right))
					&& ((r1.bottom <= r2.bottom && r2.bottom <= r1.top) || (r1.bottom <= r2.top && r2.top <= r1.top))) {
				return true;
			} else {
				return false;
			}
		}
	}

}