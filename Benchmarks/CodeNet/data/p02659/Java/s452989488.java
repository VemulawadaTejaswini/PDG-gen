import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc169/tasks/abc169_c
 * Multiplication 3
 */
public class Main {
	public static void main(String...args) {
		try (Scanner sc= new Scanner(System.in)) {
			BigDecimal a = BigDecimal.valueOf(sc.nextLong());
			BigDecimal b = BigDecimal.valueOf(sc.nextDouble());
			BigInteger ans = a.multiply(b).toBigInteger();
			System.out.println(ans);
		}
	}
}