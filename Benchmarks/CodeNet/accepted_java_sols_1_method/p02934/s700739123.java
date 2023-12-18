import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			BigDecimal divisor = BigDecimal.ZERO;
			for (int i = 0; i < size; i++) {
				BigDecimal bd = BigDecimal.ONE.setScale(15).divide(new BigDecimal(sc.nextInt()),
						BigDecimal.ROUND_HALF_UP);
				divisor = divisor.add(bd);
			}
			BigDecimal ans = BigDecimal.ONE.setScale(10).divide(divisor, BigDecimal.ROUND_HALF_UP);
			System.out.println(ans);
		}
	}
}