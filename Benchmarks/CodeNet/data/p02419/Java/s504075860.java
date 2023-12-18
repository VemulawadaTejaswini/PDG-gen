import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String W = input().toLowerCase();
		String T;
		int count = 0;

		while (!(T = input()).equals("END_OF_TEXT")) {

			String[] TArrays = T.split(" ");

			for (int i = 0; i < TArrays.length; i++) {

				if (TArrays[i].equalsIgnoreCase(W)) {

					count++;

				}
			}
		}

		System.out.println(count);

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