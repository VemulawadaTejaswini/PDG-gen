import java.util.Scanner;

public class Main {
	public static int gcd(int x, int y) {

		int d = 1;
		if (x > y) {
			for (int i = 1; i <= x % y; i++) {
				if (y % i == 0 && x % y % i == 0) {
					d = i;
				}
			}
		} else if (y > x) {
			for (int i = 1; i <= y % x; i++) {
				if (x % i == 0 && y % x % i == 0) {
					d = i;
				}
			}
		} else {
			d = y;
		}

		return d;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int d = gcd(x, y);
		System.out.println(d);
		scanner.close();
	}

}
