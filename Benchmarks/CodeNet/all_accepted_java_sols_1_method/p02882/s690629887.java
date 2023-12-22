import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = scanner.nextInt();

		double tan;

		if (x >= a * a * b / 2) {
			tan = (double) 2 * (a * a * b - x) / a / a / a;
		} else {
			tan = (double) a * b * b / 2 / x;
		}
		System.out.println(Math.atan(tan) * 180 / Math.PI);
	}
}