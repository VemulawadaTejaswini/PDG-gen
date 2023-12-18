import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			double pi = Math.PI;
			double r = sc.nextDouble();
			double a;
			double b;

			a = pi * r * r;
			b = 2 * pi * r;
			System.out.printf("%f %f",a ,b);
	}
}