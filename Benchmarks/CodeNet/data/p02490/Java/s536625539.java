import java.util.Scanner;

public class Main {
	final int MAX_N = 2;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = 0;
		int b = 0;
		while (true) {
			a = in.nextInt();
			b = in.nextInt();

			if (a == 0 && b == 0) break;

			if (a > b) {
				System.out.println(b + " " + a);
			} else {
				System.out.println(a + " " + b);
			}
		}
	}
}