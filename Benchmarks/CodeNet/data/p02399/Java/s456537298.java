import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int d = 0;
		int r = 0;
		double f = 0;
		d = (int)(a / b);
		r = (int)(a % b);
		f = a / b;
		f = 1.0 * a / b;


		System.out.printf("%d %d %.5f",d, r, f);


	}
}