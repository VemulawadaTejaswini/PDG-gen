import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		double x = 0.0;
		double y = 0.0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;

		Scanner stdin = new Scanner(System.in);

		a = stdin.nextInt();
		b = stdin.nextInt();
		c = stdin.nextInt();
	    d = stdin.nextInt();
		e = stdin.nextInt();
		f = stdin.nextInt();

		x = (e * c - b * f)/(a * e - b * d);
		y = (d * c - a * f)/(b * d - a * e);

		BigDecimal biX = new BigDecimal(String.valueOf(x));
		BigDecimal biY = new BigDecimal(String.valueOf(y));

		double newX = biX.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		double newY = biY.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(newX + "," + newY);


	}
}