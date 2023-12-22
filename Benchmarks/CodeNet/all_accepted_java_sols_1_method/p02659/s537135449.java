import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Multiplication 3
 * https://atcoder.jp/contests/abc169/tasks/abc169_c
 */
public class Main {
	public static void main(String...args) {
		try (Scanner sc= new Scanner(System.in)) {
			BigDecimal a = BigDecimal.valueOf(sc.nextLong());
			BigDecimal b = BigDecimal.valueOf(sc.nextDouble());
			BigDecimal tmp = a.multiply(b);
			BigInteger ans = tmp.toBigInteger();
			System.out.println(ans);
		}
	}
}