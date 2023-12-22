import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double p = 3.141592653589;
		double s = 1.00000 * p * r * r;
		double l = 1.00000 * 2 * p * r;
		System.out.print(String.format("%6f", s) + " ");
		System.out.println(String.format("%6f", l));
	}
}
