import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String text = input();

		char[] arrays = text.toCharArray();

		for (int i = 0; i < text.length(); i++) {

			if (Character.isUpperCase(arrays[i])) {

				arrays[i] = Character.toLowerCase(arrays[i]);

			} else {

				arrays[i] = Character.toUpperCase(arrays[i]);

			}
		}
		System.out.println(arrays);

		close();

	}

	public static String input() {

		return scanner.nextLine();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}