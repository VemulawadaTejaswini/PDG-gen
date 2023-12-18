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

		
		BigDecimal a = new BigDecimal(k[0]);
		BigDecimal b = new BigDecimal(k[1]);

		
		double val4 = a.divide(b, 5, BigDecimal.ROUND_HALF_UP).doubleValue();

		System.out.print(p);
		System.out.print(" " + r);
		System.out.println(" " + val4);

	}
}