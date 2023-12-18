import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();

		double area = r * r * Math.PI;
		double length = 2 * r * Math.PI;

		System.out.printf(String.format("%.6f %.6f",area, length));
	}

}