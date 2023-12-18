import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r;
		double pi = 3.141592;

		r = scan.nextInt();

		System.out.printf("%.6f %.6f\n", r*r*pi, 2*r*pi);
	}
}