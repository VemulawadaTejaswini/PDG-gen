import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double A = Math.PI * Math.pow(r, 2);
		double C = Math.PI * 2 * r;
		System.out.printf("%.6f %.6f\n", A, C);
	}
}