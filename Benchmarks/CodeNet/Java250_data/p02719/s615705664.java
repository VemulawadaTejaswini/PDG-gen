import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigDecimal n = new BigDecimal(sc.next());
		BigDecimal k = new BigDecimal(sc.next());

		sc.close();

		BigDecimal a = n.divideToIntegralValue(k);
		BigDecimal b = a.multiply(k);
		BigDecimal c = n.subtract(b);

		BigDecimal d = c.subtract(k).abs();

		if(c.compareTo(d) < 0) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}

	}

}
