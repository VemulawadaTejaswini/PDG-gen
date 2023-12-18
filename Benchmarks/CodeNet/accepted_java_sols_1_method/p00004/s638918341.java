import java.util.Scanner;
import java.math.BigDecimal;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double a=scan.nextInt();
			double b=scan.nextInt();
			double c=scan.nextInt();
			double d=scan.nextInt();
			double e=scan.nextInt();
			double f=scan.nextInt();
			BigDecimal x = new BigDecimal((c*e-b*f)/(a*e-b*d));
			BigDecimal y = new BigDecimal((f*a-c*d)/(a*e-d*b));
			BigDecimal bdx = x.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal bdy = y.setScale(3, BigDecimal.ROUND_HALF_UP);
			System.out.println(bdx+" "+bdy);
		}
	}
}