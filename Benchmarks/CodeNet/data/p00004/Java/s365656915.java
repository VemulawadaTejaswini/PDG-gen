import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
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
					BigDecimal bd_x = new BigDecimal(x);
					BigDecimal bd_y = new BigDecimal(y);
					BigDecimal x_ = bd_x.setScale(3, BigDecimal.ROUND_HALF_UP);
					BigDecimal y_ = bd_y.setScale(3, BigDecimal.ROUND_HALF_UP);
				
				System.out.println(x_+" "+y_);
		}
	}
}