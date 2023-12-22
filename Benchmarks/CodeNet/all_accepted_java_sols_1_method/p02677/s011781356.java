import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();

		double longAngle = m * 6;
		double shortAngle = 30 * h + m * 0.5;

		double diff = 0;
		if (longAngle < shortAngle) {
			diff = shortAngle - longAngle;
		} else {
			diff = longAngle - shortAngle;
		}

		double x = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(diff));

		System.out.println(Math.sqrt(x));


		sc.close();
	}

}
