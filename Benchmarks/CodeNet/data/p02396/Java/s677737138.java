import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int number;

		while (true) {

			number = input();

			if (number != 0) {

				list.add(number);

			} else if (number == 0) {

				break;

			}
		}

		for (int i = 0; i < list.size(); i++) {

			System.out.println("Case " + (i + 1) + ": " + list.get(i));

		}

		close();

	}

	public static int input() {

		return Integer.parseInt(scanner.next());

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}