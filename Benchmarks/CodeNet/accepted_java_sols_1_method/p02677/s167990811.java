
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, h, m;
		a = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		m = sc.nextInt();

		final double rad_per_min_720 = 11 * 2 * Math.PI;

		int min = h * 60 + m;
		double rad_dif = rad_per_min_720 * min / 720;

		double c_pow = a * a + b * b - 2 * a * b * Math.cos(rad_dif);
		double c = Math.sqrt(c_pow);

		System.out.println(c);
	}

}
