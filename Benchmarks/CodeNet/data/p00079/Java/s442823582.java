import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Point> list = new ArrayList<Point>();
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			list.add(new Point(Double.parseDouble(s[0]), Double.parseDouble(s[1])));
		}
		sc.close();
		double s = 0;
		for(int i = 1; i + 1 < list.size(); i++) {
			s += area(list.get(0), list.get(i), list.get(i + 1));
		}
		System.out.println(s);
	}
	static double area(Point p1, Point p2, Point p3) {
		return Math.abs((p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y)) / 2.0;
	}
	static class Point{
		double x, y;
		Point(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
}
