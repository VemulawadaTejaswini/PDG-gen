
import java.awt.geom.Point2D;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Point2D.Double a = getPoint(scanner);
		Point2D.Double b = getPoint(scanner);
		double sum = 0;
		while (scanner.hasNext()) {
			Point2D.Double c = getPoint(scanner);
			double A = a.distance(b);
			double B = b.distance(c);
			double C = c.distance(a);
			double z = (A + B + C) / 2;
			sum += Math.sqrt(z * (z - A) * (z - B) * (z - C));
			b = c;
		}
		System.out.println(sum);
	}

	private static double getArea(double a, double b, double c, double d) {
		return Math.abs(a * d - b * c) / 2;
	}

	public static Point2D.Double getPoint(Scanner scanner) {
		StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), ",");
		return new Point2D.Double(Double.parseDouble(tokenizer.nextToken()),
				Double.parseDouble(tokenizer.nextToken()));
	}
}