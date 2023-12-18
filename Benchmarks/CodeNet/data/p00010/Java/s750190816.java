import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws NumberFormatException{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for (int i = 0; i < n; i++) {
			double x1 = stdIn.nextDouble();
			double y1 = stdIn.nextDouble();
			double x2 = stdIn.nextDouble();
			double y2 = stdIn.nextDouble();
			double x3 = stdIn.nextDouble();
			double y3 = stdIn.nextDouble();
			double p = 0;
			double q = 0;

			p = ((y1 - y3) * ((y1 * y1) - (y2 * y2) + (x1 * x1) - (x2 * x2))
					- (y1 - y2) * ((y1 * y1) - (y3 * y3) + (x1 * x1) - (x3 * x3)))
					/ (2 * (y1 - y3) * (x1 - x2) - 2 * (y1 - y2) * (x1 - x3));
			q = ((x1 - x3) * ((x1 * x1) - (x2 * x2) + (y1 * y1) - (y2 * y2))
					- (x1 - x2) * ((x1 * x1) - (x3 * x3) + (y1 * y1) - (y3 * y3)))
					/ (2 * (x1 - x3) * (y1 - y2) - 2 * (x1 - x2) * (y1 - y3));
			double r = Math.sqrt((x1 - p) * (x1 - q) + (y1 - p) * (y1 - q));
			System.out.println(new BigDecimal(p).setScale(3, BigDecimal.ROUND_HALF_UP)+" "+new BigDecimal(q).setScale(3, BigDecimal.ROUND_HALF_UP)+" "+new BigDecimal(Math.sqrt((x1-p)*(x1-p)+(y1-q)*(y1-q))).setScale(3, BigDecimal.ROUND_HALF_UP));
		}
	}
}