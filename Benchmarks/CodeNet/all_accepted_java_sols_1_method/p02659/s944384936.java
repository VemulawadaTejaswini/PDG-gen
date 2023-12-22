import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigDecimal a = sc.nextBigDecimal(); // Immutable class.
		BigDecimal b = sc.nextBigDecimal();
		BigDecimal ans = a.multiply(b);
		
		System.out.println(ans.toBigInteger());
	}
}
