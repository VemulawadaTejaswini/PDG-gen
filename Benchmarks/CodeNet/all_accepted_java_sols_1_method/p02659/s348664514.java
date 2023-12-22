import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long A = scn.nextLong();
			BigDecimal B = scn.nextBigDecimal();

			System.out.println(BigDecimal.valueOf(A).multiply(B).setScale(0, BigDecimal.ROUND_DOWN));

		}
	}
}