import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			
			/*クラメルの公式*/
			int x = ((c * e) - (b * f)) / ((a * e) - (b * d));
			int y = ((a * f) - (c * d)) / ((a * e) - (b * d));
			
			BigDecimal x_bd = new BigDecimal(x);
			BigDecimal y_bd = new BigDecimal(y);
			
			x_bd = x_bd.setScale(3, BigDecimal.ROUND_HALF_UP);
			y_bd = y_bd.setScale(3, BigDecimal.ROUND_HALF_UP);
			
			String x_ans = x_bd.toString().format("%.3f", x_bd);
			String y_ans = y_bd.toString().format("%.3f", y_bd);
			
			System.out.println(x_ans+" "+y_ans);
		}
	}
}