import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double C = sc.nextDouble();
			
			double S = a * b * Math.sin(C / 180 * Math.PI) / 2;
			double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C / 180 * Math.PI));
			double h = 2 * S / a;
			
			System.out.format("%.6f %.6f %.6f\n", S, L, h);
		}
	}
}
