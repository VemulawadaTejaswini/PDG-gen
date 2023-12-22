
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextInt();
		double b = sc.nextInt();
		double h = sc.nextInt();
		double m = sc.nextInt();

		double angle_h = (30 * h) + 0.5 * m;
		double angle_m = 6 * m;
		double angle = 0;

		if(angle_h < angle_m) {
			angle = angle_m - angle_h;
		}else {
			angle = angle_h - angle_m;
		}

		double ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b *Math.cos(Math.toRadians(angle)));

		System.out.println(ans);

	}

}
