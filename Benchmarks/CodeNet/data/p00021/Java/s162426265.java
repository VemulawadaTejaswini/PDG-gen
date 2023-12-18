import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int inputNum = sc.nextInt();
		
		String aaa[] = new String[inputNum];

		for (int i = 0; i < inputNum; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();

			double slopeA = (y2 - y1) / (x2 - x1);
			double slopeB = (y4 - y3) / (x4 - x3);
			
			if (slopeA == slopeB) {
				aaa[i] = "YES";
			//	System.out.println("YES");
			} else {
				aaa[i] = "NO";
				//System.out.println("NO");
			}
			
		}
		for(String a:aaa) {
			System.out.println(a);
			
		}
	}

}