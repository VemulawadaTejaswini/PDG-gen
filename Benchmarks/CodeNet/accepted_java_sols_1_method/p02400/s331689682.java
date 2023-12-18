import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();
		double s = r * r * Math.PI;
		double l = 2 * r * Math.PI;

		BigDecimal src_s = BigDecimal.valueOf(s);
		BigDecimal src_l = BigDecimal.valueOf(l);
		src_s = src_s.setScale(6, BigDecimal.ROUND_DOWN);
		src_l = src_l.setScale(6, BigDecimal.ROUND_DOWN);

		System.out.println(src_s + " " + src_l);

	}

}

