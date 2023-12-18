import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			
			double pow =Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2);
			BigDecimal ans = new BigDecimal(Math.sqrt(pow));
			System.out.println(ans.setScale(6, RoundingMode.HALF_EVEN));
		}
	}

}
