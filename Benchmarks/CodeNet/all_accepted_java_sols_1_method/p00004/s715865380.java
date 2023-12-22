import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while ( sc.hasNext() ) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();

			double x = (c*e - b*f) / (a*e - b*d);
			double y = (c - a*x) / b;

			BigDecimal bdx = new BigDecimal(x);
			BigDecimal bdy = new BigDecimal(y);

			bdx = bdx.setScale(3, BigDecimal.ROUND_HALF_UP);
			bdy = bdy.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.println(bdx + " " + bdy);
		}
	}

}