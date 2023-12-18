
import java.util.Scanner;

public class RightTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws java.lang.Exception{
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);
		
		int checkNum = in.nextInt();
		
		for(int i = 0; i < checkNum; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			int tmp = (a + b + c) / 2;
			
			double space = Math.sqrt(tmp * (tmp - a) * (tmp - b) * (tmp - c));
			double angleA = 0.0;
			double angleB = 0.0;
			double angleC = 0.0;
			double high = 0.0;
			
			if ( b < a && c < a) {
				high = (2 * space) / (double)a;
				angleB = Math.toDegrees(Math.asin(high / c));
				angleC = Math.toDegrees(Math.asin(high / b));
				angleA = 180.0 - angleB - angleC;
			} else if (a < b && c < b) {
				high = (2 * space) / (double)b;
				angleC = Math.toDegrees(Math.asin(high / a));
				angleA = Math.toDegrees(Math.asin(high / c));
				angleB = 180.0 - angleA - angleC;
				
			} else if (a < c && b < c) {
				high = (2 * space) / (double)c;
				angleA = Math.toDegrees(Math.asin(high / b));
				angleB = Math.toDegrees(Math.asin(high / a));
				angleC = 180.0 - angleA - angleB;
			} else {
				// ありえない
			}
			
			if (((int)angleA) == 90 || ((int)angleB) == 90 || ((int)angleC) == 90) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}