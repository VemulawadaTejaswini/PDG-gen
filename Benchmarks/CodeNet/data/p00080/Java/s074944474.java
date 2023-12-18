import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double q;
		while ((q = in.nextInt()) >= 1) {
			double xn = q / 2.0;
			double checkVal = Math.pow(xn, 3.0) - q;
			while (Math.abs(checkVal) >= 0.00001 * q) {
				checkVal = Math.pow(xn, 3.0) - q;
				xn = xn - (checkVal) / (Math.pow(xn, 2) * 3.0);
			}
			System.out.println(xn);

		}
	}
}