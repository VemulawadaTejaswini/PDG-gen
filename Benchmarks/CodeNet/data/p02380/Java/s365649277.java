import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = Math.toRadians(sc.nextDouble());

		double h = b * Math.sin(c);
		double s = a * h / 2;
		double l = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c));
		
		System.out.println(String.format("%.4f %.4f %.4f", s, a + b + l, h));
		
		sc.close();
	}
}