import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			BigDecimal x1 = new BigDecimal(a).divide(new BigDecimal("0.08"), 0, BigDecimal.ROUND_CEILING);
			if(x1.subtract(BigDecimal.ONE).multiply(new BigDecimal("0.08")).intValue() == a) {
				x1 = x1.subtract(BigDecimal.ONE);
			}
			BigDecimal x2 = new BigDecimal(a + 1).divide(new BigDecimal("0.08"), 0, BigDecimal.ROUND_FLOOR);
			if(new BigDecimal(a + 1).remainder(new BigDecimal("0.08")).equals(BigDecimal.ZERO)) {
				x2 = x2.subtract(BigDecimal.ONE);
			}
			BigDecimal y1 = new BigDecimal(b).divide(new BigDecimal("0.1"), 0, BigDecimal.ROUND_CEILING);
			if(y1.subtract(BigDecimal.ONE).multiply(new BigDecimal("0.1")).intValue() == b) {
				y1 = y1.subtract(BigDecimal.ONE);
			}
			BigDecimal y2 = new BigDecimal(b + 1).divide(new BigDecimal("0.1"), 0, BigDecimal.ROUND_FLOOR);
			if(new BigDecimal(b + 1).remainder(new BigDecimal("0.1")).equals(BigDecimal.ZERO)) {
				y2 = y2.subtract(BigDecimal.ONE);
			}

			int min = Math.max(x1.intValue(), y1.intValue());
			int max = Math.min(x2.intValue(), y2.intValue());
			if(min <= max) {
				System.out.println(min);
			} else {
				System.out.println("-1");
			}
		}

	}

}
