import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			List<Point> points = new ArrayList<Point>();
			for(int i=0;i<n;i++) {
				points.add(new Point(sc.nextInt(), sc.nextInt()));
			}
			points.sort((p1, p2) -> {
				int result = p1.x - p2.x;
				if(result == 0)
					result = p1.y - p2.y;
				return result;
			});
			points.forEach(point -> System.out.println(point.x + " " + point.y));
		}
	}
}

