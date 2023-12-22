import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();

		if (x == 1 || x == 2 || x == 3) {
			System.out.println(x);
			return;
		}

		while (true) {
			boolean prime = true;

			for (int i = 2; i <= x / 2; i++) {
				if (x % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				System.out.println(x);
				return;
			}

			x++;
		}
	}
}
