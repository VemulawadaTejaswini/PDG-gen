import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double x;
		final double pi = 3.141592653589;
		x = scanner.nextDouble();
		System.out.printf("%5.5f %5.5f\n", pi*x*x, pi*2*x);
		scanner.close();
	}
}