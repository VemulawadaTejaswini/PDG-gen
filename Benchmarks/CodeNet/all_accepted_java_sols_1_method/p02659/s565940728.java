import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		//long[] a = new long[n];
		String s = "";
		BigDecimal bdb = new BigDecimal(String.valueOf(b));
		BigDecimal bda = new BigDecimal(String.valueOf(a));

		BigDecimal bd1 = bda.multiply(bdb).setScale(0, RoundingMode.DOWN);

		s = bd1.toPlainString();


		sc.close();
			System.out.println(s);


	}

}
