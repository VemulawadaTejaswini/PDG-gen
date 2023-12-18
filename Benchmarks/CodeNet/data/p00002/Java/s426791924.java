import java.util.Scanner;

public class Main {
	/**
	 * Digit Number
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			System.out.println(String.valueOf(a + b).length());
		}
	}
}