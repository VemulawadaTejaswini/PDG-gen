import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		BigDecimal bd1 = new BigDecimal(a);
		BigDecimal bd2 = new BigDecimal(b);


		BigDecimal c = bd1.multiply(bd2);
		System.out.println((int)Math.floor(c.doubleValue()));

		sc.close();
	}

}
