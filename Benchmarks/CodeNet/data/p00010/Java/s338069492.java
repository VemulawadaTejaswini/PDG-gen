

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int i;
		int n = scanner.nextInt();
		for (i = 0; i < n; i++) {
			double x1 =  scanner.nextDouble();
			double y1 =  scanner.nextDouble();
			double x2 =  scanner.nextDouble();
			double y2 =  scanner.nextDouble();
			double x3 =  scanner.nextDouble();
			double y3 =  scanner.nextDouble();

			double a1 = 0, b1 = 0, c1 = 0;
			double a2 = 0, b2 = 0, c2 = 0;
			if (x1 == x2) {
				a1 = 1;
				b1 = 0;
				c1 = x1;
			}else if (y1 == y2) {
				a1 = 0;
				b1 = 1;
				c1 = y1;
			}else {
				a1 = -1 * (x2 - x1) / (y2 - y1);
				double x12 = (x1 + x2) / 2;
				double y12 = (y1 + y2) / 2;
				b1 = 0;
				c1 = y12 - a1 * x12;
			}



			if (x2 == x3) {
				a2 = 1;
				b2 = 0;
				c2 = x2;
			}else if (y2 == y3) {
				a2 = 0;
				b2 = 1;
				c2 = y2;
			}else {
				a2 = -1 * (x3 - x2) / (y3 - y2);
				double x23 = (x2 + x3) / 2;
				double y23 = (y2 + y3) / 2;
				b2 = 1;
				c2 = y23 - a2 * x23;
			}



			double py = 0;
			double px = (-b1 + b2) / (a1 - a2);
			if(a1 == 0 && b2 ==0 ) {
				py = c1 / b1;
			} else if(a1 == 0) {
				py = (c2 - a2 * px) / b2;
			} else if(b2 == 0) {
				py = (c1 - a1 * px) / b1;
			} else if (a2 == 0 && b1 == 0) {
				py = c2 / b2;
			} else if(a2 == 0) {
				py = (c2 - a2 * px) / b2;
			} else if(b1 == 0) {
				py = (c2 - a2 * px) / b2;
			}
			double r = Math.sqrt(Math.pow(x1 - px, 2) + Math.pow(y1 - py, 2) );

			System.out.printf("%.3f %.3f %.3f\n", px, py, r);




		}
		scanner.close();
	}

}

