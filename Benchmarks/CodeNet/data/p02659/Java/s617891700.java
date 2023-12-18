import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		String B = sc.next(); // 文字列で受け取る
		sc.close();
		BigDecimal a = new BigDecimal(A);
		BigDecimal b = new BigDecimal(B);
		prtln(a.multiply(b).toBigInteger());
	}

	public static <T> void prtln(T t) { System.out.println(t); }
}
