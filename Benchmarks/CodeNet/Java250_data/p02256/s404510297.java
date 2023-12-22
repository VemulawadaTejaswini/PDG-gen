import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(calc(x, y));
	}

	private static int calc(int x, int y) {
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}

		while (y > 0) {
			int r = x % y;
			x = y;
			y = r;
		}

		return x;
	}
}