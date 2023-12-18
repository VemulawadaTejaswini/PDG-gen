import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner date = new Scanner(System.in);

		int n = date.nextInt();
		int cnt = 0;
		double a, b = 0, c = 0, d = 0, p, q, x, y, r, delta;
		
		while (cnt < n) {
			double x1 = date.nextDouble();
			double y1 = date.nextDouble();
			double x2 = date.nextDouble();
			double y2 = date.nextDouble();
			double x3 = date.nextDouble();
			double y3 = date.nextDouble();
			
			if (y2 - y1 == 0) {
				a = 1;
				p = (x1 + x2) / 2;
			} else {
				a = (x1 - x2) / (y2 - y1);
				b = -1;
				p = - (Math.pow(x2, 2) - Math.pow(x1, 2) - Math.pow(y1, 2) + Math.pow(y2, 2)) / (2 * (y2 - y1));
				
			}
			
			if (y3 - y2 == 0) {
				b = 1;
				q = (x2 + x3) / 2;
			} else {
				c = (x2 - x3) / (y3 - y2);
				d = -1;
				q = - (Math.pow(x3, 2) - Math.pow(x2, 2) - Math.pow(y2, 2) + Math.pow(y3, 2)) / (2 * (y3 - y2));
			}
			
			delta = a * d - b * c;
			x = (d * p - b * q) / delta;
			y = (a * q - c * p) / delta;
			r = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
			
			System.out.printf("%.3f %.3f %.3f", x, y, r);
			cnt++;
			
		}
		
	
	}

}