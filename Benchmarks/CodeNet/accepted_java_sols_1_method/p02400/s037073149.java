import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		double r = scan.nextDouble();

		final double CIRCLERATE = 3.141592653589;

		double s = CIRCLERATE * r * r;
		double l = 2 * CIRCLERATE * r;

		BigDecimal x = new BigDecimal(s);
		x = x.setScale(5, BigDecimal.ROUND_HALF_UP);

		BigDecimal y = new BigDecimal(l);
		y = y.setScale(5, BigDecimal.ROUND_HALF_UP);

		System.out.printf("%.5f" + " " + "%.5f", x, y);
	}
}