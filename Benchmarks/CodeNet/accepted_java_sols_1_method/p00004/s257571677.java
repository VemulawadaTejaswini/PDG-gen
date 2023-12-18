import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();

			double x,y;

			/*クラメルの公式*/

			x = ((c*e)-(b*f))/((a*e)-(b*d));
			y = ((a*f)-(c*d))/((a*e)-(d*b));
			
			BigDecimal bd1 = new BigDecimal(x);
			BigDecimal bd2 = new BigDecimal(y);
			
			BigDecimal x_bd = bd1.setScale(3,BigDecimal.ROUND_UP);
			BigDecimal y_bd = bd2.setScale(3,BigDecimal.ROUND_UP);
			
			String x_ans = x_bd.toString().format("%.3f", x_bd);
			String y_ans = y_bd.toString().format("%.3f", y_bd);

			System.out.println(x_ans+ " " +y_ans);
		}
	}
}