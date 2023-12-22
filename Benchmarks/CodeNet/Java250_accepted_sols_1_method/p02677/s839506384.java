
import java.util.Scanner;
//import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		// calculate angle
		double diff = Math.abs(h * 30 + m * 0.5 - m * 6);
		double angle = 0;
		if (diff == 180) {
			System.out.println(a + b);
		} else if (diff < 180) {
			angle = Math.toRadians(diff);
			// calculate distance
			double ans = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(angle);
			System.out.println(Math.sqrt(ans));
			sc.close();
		} else {
			angle = Math.toRadians(360 - diff);
			// calculate distance
			double ans = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(angle);
			System.out.println(Math.sqrt(ans));
			sc.close();
		}

	}

}
