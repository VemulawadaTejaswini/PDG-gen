import java.util.*;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double x[] = new double[3];
		double y[] = new double[3];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < 3; j++){
				x[j] = scan.nextDouble();
				y[j] = scan.nextDouble();
			}
			double a = 2 * (x[1] - x[0]);
			double b = 2 * (y[1] - y[0]);
			double c = x[0]*x[0] - x[1]*x[1] + y[0]*y[0] - y[1]*y[1];
			double d = 2*(x[2]-x[1]);
			double e = 2*(y[2]-y[1]);
			double f = x[1]*x[1] - x[2]*x[2] + y[1]*y[1] - y[2]*y[2];

			double cx = (b*f - c*e)/(a*e - d*b);
			double cy = (a*f - c*d)/(b*d - a*e);

			double r = Math.sqrt((x[0]-cx)*(x[0]-cx) + (y[0]-cy)*(y[0]-cy));

			/*BigDecimal bdx = new BigDecimal(cx);
			BigDecimal bdy = new BigDecimal(cy);
			BigDecimal bdr = new BigDecimal(r);
			BigDecimal cx1 = bdx.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal cy1 = bdy.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal rn = bdr.setScale(3,BigDecimal.ROUND_HALF_UP);*/

			//System.out.println(cx1+ " " +cy1+ " " +rn);

			System.out.printf("%.3f %.3f %.3f\n", cx, cy, r);

		}
	}
}