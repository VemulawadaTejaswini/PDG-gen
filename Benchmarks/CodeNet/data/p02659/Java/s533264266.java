
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		BigDecimal x = new BigDecimal(a);
		BigDecimal y = new BigDecimal(b);
		x = x.multiply(y);
		System.out.println(x.toBigInteger());
	}
}
