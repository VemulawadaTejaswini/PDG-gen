import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		
		for(int i = 0;i < inputNum;i++) {
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		calc(x1,y1,x2,y2,x3,y3);
		}

	}

	public static void calc(double x1, double y1, double x2, double y2,
			double x3, double y3) {
		double a1 = (x2 - x1) *2;
		double b1 = (y2 - y1) *2;
		double c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
		double a2 = (x3 - x1) *2;
		double b2 = (y3 - y1) *2;
		double c2 = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;
		
		double x = (b1 * c2 -b2 * c1 ) / (a1 * b2 - a2 * b1);
		double y = (c1 * a2 -c2 * a1 ) / (a1 * b2 - a2 * b1);
		
		double a= x - x1;
		double b = y -y1;
		
		double rad = Math.sqrt((a * a) + (b * b));
		
		BigDecimal bigRad = new BigDecimal(rad);
		
		BigDecimal radius = bigRad.setScale(3, BigDecimal.ROUND_HALF_UP);
		
		System.out.printf("%.3f %.3f %.3f\n",x,y,radius);
	}

}