import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			Set<Point> juels = new HashSet<Point>();
			while (n-- > 0) {
				juels.add(new Point(in.nextInt(), in.nextInt()));
			}
			int m = in.nextInt();
			Point robot = new Point(10, 10);
			while (m-- > 0) {
				juels.remove(robot);
				String next = in.next();
				int d = in.nextInt();
				if (!juels.isEmpty()) {
					int dx = 0, dy = 0;
					switch (next.charAt(0)) {
					case 'N':
						dy = +1;
						break;
					case 'S':
						dy = -1;
						break;
					case 'E':
						dx = +1;
						break;
					case 'W':
						dx = -1;
						break;
					}
					while (d-- > 0) {
						robot.x += dx;
						robot.y += dy;
						juels.remove(robot);
					}
				}
			}
			System.out.println(juels.isEmpty() ? "Yes" : "No");
		}
		in.close();
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		return (x << 8) + y;
	}

	@Override
	public boolean equals(Object obj) {
		return this.x == ((Point) obj).x && this.y == ((Point) obj).y;
	}
}