import java.util.Scanner;

public class Main {
	public final static double PI = 3.14159265358979;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		System.out.printf("%.6f ", x * x * PI);
		System.out.printf("%.6f\n", x * 2 * PI);
	}
}