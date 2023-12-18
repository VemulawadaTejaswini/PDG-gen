import java.awt.Point;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Point> juels = new HashSet<Point>();
		Point robot = new Point();
		while (n != 0) {
			juels.clear();
			robot.setLocation(10, 10);
			for (int i = 0; i < n; i++) {
				juels.add(new Point(in.nextInt(), in.nextInt()));
			}
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				String v = in.next();
				int size = in.nextInt();
				if (!juels.isEmpty()) {
					for (int j = 0; j < size; j++) {
						if ("N".equals(v)) {
							robot.y++;
						} else if ("S".equals(v)) {
							robot.y--;
						} else if ("E".equals(v)) {
							robot.x++;
						} else if ("W".equals(v)) {
							robot.x--;
						}
						juels.remove(robot);
					}
				}
			}
			if (juels.isEmpty()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			n = in.nextInt();
		}
	}
}