import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), C = sc.nextDouble();
		C *= Math.PI;
		C /= 180;
		double S = a * b * Math.sin(C) / 2;
		double l = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C));
		double h = S * 2 / a;
		System.out.printf("%f\n%f\n%f\n", S, l, h);
		sc.close();
	}
}
