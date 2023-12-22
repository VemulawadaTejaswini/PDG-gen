import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
		
		double x = r * r * Math.PI;
		double y = r * 2 * Math.PI;
		
		
		BigDecimal X = new BigDecimal(x);
		BigDecimal z = X.setScale(5, BigDecimal.ROUND_HALF_UP);
		BigDecimal Y = new BigDecimal(y);
		BigDecimal z2 = Y.setScale(5, BigDecimal.ROUND_HALF_UP);
		System.out.printf("%.5f",z);
		System.out.print(" ");
		System.out.printf("%.5f",z2);
	}

}