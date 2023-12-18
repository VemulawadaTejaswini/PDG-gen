import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int a = input();
		int b = input();

		System.out.print(a / b);
		System.out.print(" ");
		System.out.print(a % b);
		System.out.print(" ");
		System.out.print(String.format("%.5f", (double) a / b));

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