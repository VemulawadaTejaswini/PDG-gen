import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			while (true) {
				BigDecimal x = new BigDecimal(sc.next());
				BigDecimal ten = new BigDecimal(10);
				
				if (x.equals(BigDecimal.ZERO)) {
					break;
				}

				int cnt = String.valueOf(x).toCharArray().length;
				int sum = 0;
				for (int i = 0; i < cnt; i++) {
					sum += Integer.valueOf(x.remainder(ten).toString());
					x = x.divide(ten, RoundingMode.DOWN);
				}
				System.out.println(sum);
			}
		}
	}
}
