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
			if (((this.left <= other.left && other.left <= this.right) || (this.left <= other.right && other.right <= this.right))
					&& ((this.bottom <= other.bottom && other.bottom <= this.top) || (this.bottom <= other.top && other.top <= this.top))) {
				return true;
			} else {
				return false;
			}
		}
	}

}