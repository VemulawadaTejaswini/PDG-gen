import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int w = Integer.parseInt(input());
		int[] amida = new int[w];

		for (int i = 0; i < w; i++) {

			amida[i] = i + 1;

		}

		int n = Integer.parseInt(input());

		for (int j = 0; j < n; j++) {

			String[] change = input().split(",");
			int temp = amida[Integer.parseInt(change[0]) - 1];
			amida[Integer.parseInt(change[0]) - 1] = amida[Integer.parseInt(change[1]) - 1];
			amida[Integer.parseInt(change[1]) - 1] = temp;

		}

		for (int k: amida) {

			System.out.println(k);

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