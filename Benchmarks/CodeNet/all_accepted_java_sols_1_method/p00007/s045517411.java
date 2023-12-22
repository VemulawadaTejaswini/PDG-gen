import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double loan = 100_000.0;
//		BigDecimal bdl = new BigDecimal(loan);
//		BigDecimal interest = new BigDecimal(1.05);
//		for (int i = 0; i < n; i++) {
////			loan = loan * 1.05;
//			bdl = bdl.multiply(interest);
//			bdl = bdl.setScale(-3, RoundingMode.UP);
//		}
//		System.out.println(bdl.intValue());
		for (int i = 0; i < n; i++) {
			loan = loan * 1.05;
			BigDecimal bdl = new BigDecimal(loan);
			bdl = bdl.setScale(-3, RoundingMode.UP);
			loan = bdl.doubleValue();
		}
		System.out.println( (int)loan );
	}

}