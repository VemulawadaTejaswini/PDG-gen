import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

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



		BigDecimal biX = new BigDecimal(String.valueOf((e * c - b * f)/(a * e - b * d)));
		BigDecimal biY = new BigDecimal(String.valueOf((d * c - a * f)/(b * d - a * e)));

		double x = biX.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		double y = biY.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(x + "," + y);


	}
}