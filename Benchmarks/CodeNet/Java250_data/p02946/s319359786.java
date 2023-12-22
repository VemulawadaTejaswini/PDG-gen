import java.util.Scanner;

public class Main {
	private static String text;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		String[] lines = line.split(" ");

		int K = Integer.parseInt(lines[0]);
		int X = Integer.parseInt(lines[1]);

		for (int i = 0; i < (2 * K) - 1; i++) {
			System.out.print((X - K + 1) + i + " ");
		}

	}
}