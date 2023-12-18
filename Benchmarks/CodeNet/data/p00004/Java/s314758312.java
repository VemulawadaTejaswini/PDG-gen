import java.util.Scanner;
import java.math.BigDecimal;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double g = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			double e = scan.nextDouble();
			double f = scan.nextDouble();
			double x = (c*e-b*f)/(g*e-b*d);
			double y = (c*d-g*f)/(b*d-g*e);
			BigDecimal bx = new BigDecimal(String.valueOf(x));
			BigDecimal by = new BigDecimal(String.valueOf(y));
			System.out.println(bx.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue());
			System.out.println(by.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue());
		}
	}
}