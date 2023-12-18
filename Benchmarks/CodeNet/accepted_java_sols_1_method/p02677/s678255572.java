import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();

		// 中心角
		double deg = 0;
		deg = (30 * h) + (0.5 * m) - (6 * m);

		// a2 = b2 + c2 - 2bcCOSdeg
		double ans = Math.sqrt((a*a) + (b*b) - (2*a*b*Math.cos(Math.toRadians(deg))));
		System.out.println(ans);

		scan.close();

	}

}
