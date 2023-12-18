import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String str = input();
		StringBuilder sb = new StringBuilder();
		sb.append(str);

		int q = Integer.parseInt(input());

		for (int i = 0; i < q; i++) {

			String[] opreration = input().split(" ");
			int a = Integer.parseInt(opreration[1]);
			int b = Integer.parseInt(opreration[2]);

			if (opreration[0].equals("print")) {

				System.out.println(sb.substring(a, b + 1));

			} else if (opreration[0].equals("reverse")) {

				StringBuilder temp = new StringBuilder(sb.substring(a, b + 1));
				sb.replace(a, b + 1, temp.reverse().toString());

			} else if (opreration[0].equals("replace")) {

				sb.replace(a, b + 1, opreration[3]);

			}
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