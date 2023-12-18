import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long r = in.nextLong();

		double a = r * r * Math.PI;
		double b = (r * 2) * Math.PI;

		System.out.println(String.format("%f %f", a, b));
	}
}