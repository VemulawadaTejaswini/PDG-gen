import java.util.*;
import java.text.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double a1 = 2*(x2-x1);
			double b1 = 2*(y2-y1);
			double c1 = x1*x1+y1*y1-x2*x2-y2*y2;
			double a2 = 2*(x3-x1);
			double b2 = 2*(y3-y1);
			double c2 = x1*x1+y1*y1-x3*x3-y3*y3;
			double x = (b1*c2-b2*c1)/(a1*b2-a2*b1);
			double y = (c1*a2-c2*a1)/(a1*b2-a2*b1);
			double r = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
			BigDecimal ax = new BigDecimal(x);
			BigDecimal ay = new BigDecimal(y);
			BigDecimal ar = new BigDecimal(r);
			double aax = ax.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			double aay = ay.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			double aar = ar.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			DecimalFormat df = new DecimalFormat("###.000");
			System.out.println(df.format(aax)+" "+df.format(aay)+" "+df.format(aar));
		}
	}
}