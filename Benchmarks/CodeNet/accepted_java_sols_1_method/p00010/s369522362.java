import static java.lang.Math.pow;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
private static final int A = 0, B = 1, C = 2;
private static final int X = 0;
private static final int Y = 1;

public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	for (int i = 0, last = in.nextInt(); i < last; i++) {
		double ax = in.nextDouble();
		double ay = in.nextDouble();
		double bx = in.nextDouble();
		double by = in.nextDouble();
		double cx = in.nextDouble();
		double cy = in.nextDouble();
		double ax2 = pow(ax, 2);
		double ay2 = pow(ay, 2);
		double bx2 = pow(bx, 2);
		double by2 = pow(by, 2);
		double cx2 = pow(cx, 2);
		double cy2 = pow(cy, 2);
		double x_ba = bx - ax;
		double x_ca = cx - ax;
		double y_ba = by - ay;
		double y_ca = cy - ay;
		double x = (
		        (y_ba * (ax2 + ay2 - cx2 - cy2)
		        - y_ca * (ay2 - by2 - bx2 + ax2))
		        / (x_ba * y_ca - x_ca * y_ba)
		        ) / 2;
		double y = (
		        (x_ca * (+ay2 - by2 - bx2 + ax2)
		        - x_ba * (ax2 + ay2 - cx2 - cy2))
		        / (x_ba * y_ca - x_ca * y_ba)) / 2;
		double r = Math
		        .sqrt(pow(x - ax, 2) + pow(y - ay, 2));
		NumberFormat format = DecimalFormat.getInstance();
		format.setMaximumFractionDigits(3);
		format.setMinimumFractionDigits(3);
		System.out.println(format.format(x) + " " + format
		        .format(y) + " " + format.format(r));

	}
}
}