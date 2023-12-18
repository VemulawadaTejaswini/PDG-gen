import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Point2D.Double P1 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
			Point2D.Double P2 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
			System.out.println(P1.distance(P2));
		}
	}
}

