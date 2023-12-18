import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
					   b = b*d;
					   c = c*d;
					   e = e*a;
					   f = f*a;
				
					double y = (c-f)/(b-e);
					double x = (c-(b*y))/(a*d);
					BigDecimal bi0 = new BigDecimal(String.valueOf(x));
					BigDecimal bi1 = new BigDecimal(String.valueOf(y));
			System.out.println(bi0.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue() +" "+ bi1.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
	}
}