import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		while (true) {

			StringBuilder sb = new StringBuilder();
			String input = input();

			if (input.equals("-")) {

				break;

			} else {

				sb.append(input);

			}

			int n = Integer.parseInt(input());

			for (int i = 0; i < n; i++) {

				int h = Integer.parseInt(input());

				sb.append(sb.substring(0, h));
				sb.delete(0, h);

			}

			list.add(sb.toString());

		}

		for (int j = 0; j < list.size(); j++) {

			System.out.println(list.get(j));

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