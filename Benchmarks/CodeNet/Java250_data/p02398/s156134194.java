import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int counter = 0;
		int a = input();
		int b = input();
		int c = input();

		for (int i = a; i <= b; i++) {

			if (c % i == 0) {

				counter++;

			}
		}

		System.out.println(counter);

		close();

	}

	public static int input() {

		return scanner.nextInt();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}