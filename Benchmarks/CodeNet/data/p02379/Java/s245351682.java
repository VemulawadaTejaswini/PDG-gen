import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] coordinates = input().split(" ");
		int x1 = Integer.parseInt(coordinates[0]);
		int y1 = Integer.parseInt(coordinates[1]);
		int x2 = Integer.parseInt(coordinates[2]);
		int y2 = Integer.parseInt(coordinates[3]);

		System.out.println(Math.sqrt(Math.abs(Math.pow((x2 - x1), 2)) + Math.abs(Math.pow((y2 - y1), 2))));

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