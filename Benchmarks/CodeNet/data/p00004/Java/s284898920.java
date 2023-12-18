import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				int[] n = new int[6];
				for (int i = 0; i < 6; i++) {
					n[i] = sc.nextInt();
				}
				BigDecimal y = BigDecimal.valueOf(n[3] * n[2] - n[0] * n[5])
						.divide(BigDecimal.valueOf(n[1] * n[3] - n[0] * n[4]), 3, RoundingMode.HALF_UP);
				BigDecimal x = BigDecimal.valueOf(n[2] * n[4] - n[1] * n[5])
						.divide(BigDecimal.valueOf(n[0] * n[4] - n[1] * n[3]), 3, RoundingMode.HALF_UP);

				System.out.printf("%s %s\n", x, y);
			}
		}
	}
}