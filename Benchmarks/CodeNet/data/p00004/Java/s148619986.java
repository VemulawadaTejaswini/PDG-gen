import java.math.BigDecimal;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			double r, x, y, z ;
			r = d*c/a;
			z = -1*d*b/a;
			y = (f + (-1)*r) / (z+e);
			x = (c + (-1)*b*y) / a;
			BigDecimal xx = new BigDecimal(x);
			BigDecimal yy = new BigDecimal(y);
			BigDecimal xx1 = xx.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal yy1 = yy.setScale(3, BigDecimal.ROUND_HALF_UP);
			System.out.printf("%.3f %.3f", xx1, yy1);
		}
	}
}