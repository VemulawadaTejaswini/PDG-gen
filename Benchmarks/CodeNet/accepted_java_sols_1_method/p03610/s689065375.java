import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		for (int i = 1; i <= s.length(); i++) {
			if (i % 2 == 1) {
				System.out.print(s.charAt(i - 1));
			}
		}
	}
}
