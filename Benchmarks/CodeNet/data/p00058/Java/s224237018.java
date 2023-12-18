import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			double ax, ay, bx, by, cx, cy, dx, dy;
			String points[] = line.split(" ");

			ax = Double.parseDouble(points[0]);
			ay = Double.parseDouble(points[1]);
			bx = Double.parseDouble(points[2]);
			by = Double.parseDouble(points[3]);
			cx = Double.parseDouble(points[4]);
			cy = Double.parseDouble(points[5]);
			dx = Double.parseDouble(points[6]);
			dy = Double.parseDouble(points[7]);

			if (ax == bx && cy == dy) {
				System.out.println("YES");
			} else if (ay == by && cx == dx) {
				System.out.println("YES");
			} else if (Math.abs((ay - by) * (cy - dy)) == Math.abs((ax - bx)
					* (cx - dx))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}