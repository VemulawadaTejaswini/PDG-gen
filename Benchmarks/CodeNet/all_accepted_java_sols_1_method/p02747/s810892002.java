import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		if (string.length() % 2 != 0) {
			System.out.println("No");
			return;
		}
		for (int i = 0; i < string.length(); i++) {
			if (i % 2 == 0) {
				if (string.charAt(i) != 'h') {
					System.out.println("No");
					return;
				}
			} else {
				if (string.charAt(i) != 'i') {
					System.out.println("No");
					return;
				}
			}

		}
		System.out.println("Yes");

	}

}
