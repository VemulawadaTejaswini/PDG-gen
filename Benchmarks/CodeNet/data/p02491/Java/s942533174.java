import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a = in.nextInt();
		int b = in.nextInt();

		int d = a / b;
		int r = a % b;
		double f = (double) a / b;
		System.out.println(d + " " + r + " " + f);
	}
}