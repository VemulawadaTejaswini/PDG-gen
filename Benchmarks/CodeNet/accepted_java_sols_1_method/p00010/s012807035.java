

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

			double X12 = x1 - x2;
			double Y12 = y1 - y2;
			double X32 = x3 - x2;
			double Y32 = y3 - y2;

			double px = (Y32*(X12*(x1+x2)+Y12*(y1+y2))-Y12*(X32*(x3+x2)+Y32*(y3+y2)))/(2*X12*Y32-2*Y12*X32);
	        double py = (-X32*(X12*(x1+x2)+Y12*(y1+y2))+X12*(X32*(x3+x2)+Y32*(y3+y2)))/(2*X12*Y32-2*Y12*X32);
			double r = Math.sqrt(Math.pow(x1 - px, 2) + Math.pow(y1 - py, 2) );

			System.out.printf("%.3f %.3f %.3f\n", px, py, r);

		}
		scanner.close();
	}

}

