import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int r = Integer.parseInt(line);
		Double m = r * r * 3.141592;
		Double s = 2 * r * 3.141592;

		BigDecimal v = new BigDecimal(m);
		BigDecimal v2 = new BigDecimal(s);

		v.setScale(6, BigDecimal.ROUND_DOWN);
		v2.setScale(6, BigDecimal.ROUND_DOWN);
		System.out.println(v.toPlainString() + " " + v2.toPlainString());
	}
}