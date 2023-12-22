import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = input();

		int hour = number / (60 * 60);
		int minute = (number % (60 * 60)) / 60;
		int second = number % 60;

		System.out.println(hour + ":" + minute + ":" + second);

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