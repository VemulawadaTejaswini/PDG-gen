import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			BigDecimal t = BigDecimal.valueOf(scanner.nextLong());
			BigDecimal x = BigDecimal.valueOf(scanner.nextLong());
			System.out.println(t.divide(x, 10, RoundingMode.HALF_UP));
		}
	}
}
