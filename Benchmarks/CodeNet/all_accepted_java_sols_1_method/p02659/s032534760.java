
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			BigDecimal a = BigDecimal.valueOf(sc.nextDouble());
			BigDecimal b = BigDecimal.valueOf(sc.nextDouble());

			a = a.multiply(b);
			a = a.setScale(0, BigDecimal.ROUND_DOWN);
			System.out.println(a);
		}
	}
}
