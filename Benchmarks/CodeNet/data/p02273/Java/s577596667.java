import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static class Point {
		double x;
		double y;
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return String.format("%.8f %.8f", x, y);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		reader.close();		
		getKochCurve(n, new Point(0, 0), new Point(100, 0));
	}

	private static void getKochCurve(int n, Point start, Point end) {
		System.out.println(start);
		getKochCurve(0, n, start, end);
		System.out.println(end);
	}

	private static void getKochCurve(int i, int n, Point start, Point end) {		
		if (i < n) {
			Point[] temp = divide(start, end);
			Point firstPoint = temp[0];
			Point thirdPoint = temp[1];
			Point secondPoint = getSecondPoint(start, end, firstPoint, thirdPoint);
			getKochCurve(i + 1, n, start, firstPoint);
			System.out.println(firstPoint);
			getKochCurve(i + 1, n, firstPoint, secondPoint);
			System.out.println(secondPoint);
			getKochCurve(i + 1, n, secondPoint, thirdPoint);
			System.out.println(thirdPoint);
			getKochCurve(i + 1, n, thirdPoint, end);
		}
	}

	private static Point[] divide(Point start, Point end) {
		
		double deltaX = end.x - start.x;
		double deltaY = end.y - start.y;

		deltaX = deltaX / 3;
		deltaY = deltaY / 3;		
		
		Point point1 = new Point(start.x + deltaX, start.y + deltaY);
		Point point2 = new Point(end.x - deltaX, end.y - deltaY);

		Point[] points = new Point[2];
		points[0] = point1;
		points[1] = point2;
		return points;
	}

	private static Point getSecondPoint(Point start, Point end, Point second, Point third) {
		double deltaX = third.x - second.x;
		double deltaY = third.y - second.y;
		double len = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));		
		double x;
		double y;		
		if (deltaY == 0) {
			x = start.x + (end.x - start.x) / 2;
			if (start.x < end.x) {
				y = second.y + Math.sqrt((Math.pow(len, 2) - Math.pow(len / 2.0, 2)));
			} else {
				y = second.y - Math.sqrt((Math.pow(len, 2) - Math.pow(len / 2.0, 2)));
			}
		} else if (start.x < end.x && start.y < end.y) {
			x = start.x;
			y = third.y;
		} else if (start.x < end.x && start.y > end.y) {
			x = end.x;
			y = second.y;
		} else if (start.x > end.x && start.y < end.y) {
			x = end.x;
			y = second.y;
		} else {
			x = start.x;
			y = third.y;
		}
		return new Point(x, y);
	}
}

