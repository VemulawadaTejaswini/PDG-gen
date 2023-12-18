import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double H = scan.nextDouble();
		double M = scan.nextDouble();
		double x = 0;
		double theta = 0;

		theta = Math.abs(6 * M - (30 * H + 0.5 * M));
		if (theta > 180) theta -= 180;
		System.out.println(theta + ":" + Math.cos(theta / 360 * 2 * Math.PI));

		x = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(theta / 360 * 2 * Math.PI));

		System.out.println(x);


 	}
}