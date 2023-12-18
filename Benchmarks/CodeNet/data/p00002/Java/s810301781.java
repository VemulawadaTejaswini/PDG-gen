import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (scanner.hasNext()) {

			String[] numSet = input().split(" ");

			int a = Integer.parseInt(numSet[0]);
			int b = Integer.parseInt(numSet[1]);

			System.out.println(String.valueOf(a + b).length());

		}

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