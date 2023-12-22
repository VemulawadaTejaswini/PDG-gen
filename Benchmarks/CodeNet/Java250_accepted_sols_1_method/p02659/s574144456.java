import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();

		BigDecimal x = BigDecimal.valueOf(b);
		x.multiply(BigDecimal.valueOf(a));

		System.out.println(x.multiply(BigDecimal.valueOf(a)).longValue());
	}

}
