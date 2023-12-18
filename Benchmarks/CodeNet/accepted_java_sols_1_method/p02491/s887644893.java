import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		long a = in.nextLong();
		long b = in.nextLong();

		long d = a / b;
		long r = a % b;
		double f = (double) a / b;
		System.out.println(String.format("%d %d %f", d, r, f));
	}
}