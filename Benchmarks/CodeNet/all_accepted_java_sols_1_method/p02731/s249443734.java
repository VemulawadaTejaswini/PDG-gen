import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double L = scan.nextDouble();


		BigDecimal Max = new BigDecimal(Math.pow(L/3, 3));

		System.out.printf(Max.toPlainString());
		scan.close();

	}

}
