import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double ra = H / 12.0;
		double rb = M / 60.0;
		ra += 1 / 12.0 * rb;
		double a = (Math.max(ra, rb) - Math.min(ra, rb)) * 360;
		if (a > 180) {
			a = 360 - a;
		}
		double cosA = Math.cos(Math.toRadians(a));
		System.out.println(Math.sqrt(A * A + B * B - 2 * A * B * cosA));
	}

}
