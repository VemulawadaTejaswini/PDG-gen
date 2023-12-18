import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double ch = 180.0 / Math.PI;

		Scanner in = new Scanner(System.in);
		double a = in.nextDouble(), b = in.nextDouble(), x = in.nextDouble();
		in.close();

		double ans = 0.0;
		double lim = a * a * b / 2;

		if ( x <= lim ) {
			System.out.println(90.0 - Math.atan(x * 2 / (a * b * b)) * ch);
		} else {
			System.out.println(Math.atan(2 * (b - x / (a * a)) / a) * ch);
		}

	}
}