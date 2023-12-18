import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.nextLine());
			BigDecimal mother = new BigDecimal(0);
			for (int i = 0; i < n; i++) {
				mother = mother.add(new BigDecimal(1).divide(sc.nextBigDecimal(), 8, BigDecimal.ROUND_HALF_DOWN));
			}
			System.out.println(new BigDecimal(1).divide(mother, 8, BigDecimal.ROUND_HALF_DOWN));
		}
	}
}