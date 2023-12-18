import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(num > 0){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			
			/*クラメルの公式*/
			double a = 2 * (x1 - x2);
			double b = 2 * (y1 - y2);
			double c = (x1 * x1) + (y1 * y1) - ((x2 * x2) + (y2 * y2));
			double d = 2 * (x1 - x3);
			double e = 2 * (y1 - y3);
			double f = (x1 * x1) + (y1 * y1) - ((x3 * x3) + (y3 * y3));
			
			double px = ((c * e) - (b * f)) / ((a * e) - (b * d));
			double py = ((a * f) - (c * d)) / ((a * e) - (b * d));
			
			/*2点間の距離*/
			double r = Math.sqrt(((x2 - px) * (x2 - px)) + ((y2 - py) * (y2 - py)));
			
			print(px, py, r);
			
			num--;
		}//while
	}
	
	public static void print(double x, double y, double r) {
		BigDecimal x_bd = new BigDecimal(x);
		BigDecimal y_bd = new BigDecimal(y);
		BigDecimal r_bd = new BigDecimal(r);
		
		x_bd = x_bd.setScale(3, BigDecimal.ROUND_HALF_UP);
		y_bd = y_bd.setScale(3, BigDecimal.ROUND_HALF_UP);
		r_bd = r_bd.setScale(3, BigDecimal.ROUND_HALF_UP);
		
		String x_ans = x_bd.toString().format("%.3f", x_bd);
		String y_ans = y_bd.toString().format("%.3f", y_bd);
		String r_ans = r_bd.toString().format("%.3f", r_bd);
		
		System.out.println(x_ans+" "+y_ans+" "+r_ans);
	}
}