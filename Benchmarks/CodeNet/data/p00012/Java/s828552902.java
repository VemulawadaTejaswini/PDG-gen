import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {
			Path2D.Double tri = new Path2D.Double();
			tri.moveTo(scan.nextDouble(), scan.nextDouble());
			tri.lineTo(scan.nextDouble(), scan.nextDouble());
			tri.lineTo(scan.nextDouble(), scan.nextDouble());

			Point2D.Double pt = new Point2D.Double(scan.nextDouble(), scan.nextDouble());

			if(tri.contains(pt)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

		}
	}
}