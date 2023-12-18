import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			long tempA = input();
			long tempB = input();

			long a;
			long b;
			long r;
			long lcm;

			if (tempB <= tempA) {

				a = tempA;
				b = tempB;

			} else {

				a = tempB;
				b = tempA;

			}

			while ((r = a % b) != 0) {

				a = b;
				b = r;

			}

			lcm = tempA * tempB / b;

			System.out.print(b);
			System.out.print(" ");
			System.out.println(lcm);

		}

		close();

	}

	public static long input() {

		return scanner.nextLong();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}