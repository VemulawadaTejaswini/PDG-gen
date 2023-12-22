import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int v = Integer.parseInt(k[0]);
		int v2 = Integer.parseInt(k[1]);
		int p = v / v2;
		int r = v % v2;

		double f = Integer.parseInt(k[0]);
		double f2 = Integer.parseInt(k[1]);
		double ff = f / f2;
		BigDecimal bigDecimal = new BigDecimal(ff);
		bigDecimal.setScale(5, BigDecimal.ROUND_DOWN);

		System.out.print(p);
		System.out.print(" " + r);
		System.out.println(" " + bigDecimal.toPlainString());

	}
}