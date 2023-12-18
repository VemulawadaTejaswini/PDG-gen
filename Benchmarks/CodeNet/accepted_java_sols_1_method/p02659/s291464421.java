import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextLong();
		var b = sc.next();
		sc.close();

		var result = BigDecimal.valueOf(a).multiply(new BigDecimal(b));
		System.out.println(result.longValue());
	}
}