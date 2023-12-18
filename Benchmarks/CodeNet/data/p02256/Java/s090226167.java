import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();

		if (x >= y) {
			System.out.println(calculate(x, y));
		} else if (x < y) {
			System.out.println(calculate(y, x));
		}
	}

	private static int calculate(int a, int b) {
		int tempt;
		while ((tempt = a % b) != 0) {
			a = b;
			b = tempt;
		}
		return b;
	}
}

