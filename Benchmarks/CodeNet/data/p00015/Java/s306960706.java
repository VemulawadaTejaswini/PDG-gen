import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final int n = Integer.parseInt(sc.nextLine());
			while (sc.hasNext()) {
				BigDecimal x = new BigDecimal(sc.nextLine());
				BigDecimal y = new BigDecimal(sc.nextLine());
				BigDecimal z = x.add(y);
				System.out.println((z.precision() > 80) ? "overflow" : z);
			}
		}
	}
}