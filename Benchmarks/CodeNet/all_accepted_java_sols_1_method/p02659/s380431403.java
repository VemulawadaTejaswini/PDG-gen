import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = new BigDecimal(sc.next());
		BigDecimal b = new BigDecimal(sc.next());
		BigDecimal c = a.multiply(b);
		BigDecimal d = c.setScale(0, RoundingMode.DOWN);
		System.out.println(d);
	}
}
