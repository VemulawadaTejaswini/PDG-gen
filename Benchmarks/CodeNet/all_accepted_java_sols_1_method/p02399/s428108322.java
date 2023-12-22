import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;

		Scanner in = new Scanner(System.in);

		a = in.nextDouble();
		b = in.nextDouble();

		int d = (int) (a / b);
		int r = (int) (a % b);
		double f = a / b;

		System.out.println(d + " " + r + " " + String.format("%f", f));

	}

}