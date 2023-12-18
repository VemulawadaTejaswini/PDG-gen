import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double C = scan.nextDouble();

		double h = Math.sin(Math.PI * C / 180) * b;
		double S = a * h / 2;
		double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.PI * C / 180));

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
		scan.close();
		System.exit(0);
	}

}