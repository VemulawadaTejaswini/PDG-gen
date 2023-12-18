import java.awt.geom.Point2D;
import java.text.DecimalFormat;
import java.util.Scanner;


class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point2D.Double point = new Point2D.Double();
		System.out.println(new DecimalFormat("0.00000000").format(point.distance(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble())));
	}
}