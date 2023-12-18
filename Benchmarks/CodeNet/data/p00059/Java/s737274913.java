import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Rectangle2D a = new Rectangle2D.Double();
		Rectangle2D b = new Rectangle2D.Double();
		while (in.hasNext()) {
			double xa1 = in.nextDouble();
			double ya1 = in.nextDouble();
			double xa2 = in.nextDouble();
			double ya2 = in.nextDouble();
			double xb1 = in.nextDouble();
			double yb1 = in.nextDouble();
			double xb2 = in.nextDouble();
			double yb2 = in.nextDouble();
			String result = xa1 <= xb2 && xa2 >= xb1 && ya1 <= yb2
					&& ya2 >= yb1 ? "YES" : "NO";
			System.out.println(result);
		}
	}
}