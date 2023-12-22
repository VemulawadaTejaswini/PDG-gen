import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] array = scanner.nextLine().toCharArray();
			char prev = ' ';
			for (char c : array) {
				if (prev == c) {
					System.out.println("Bad");
					return;
				}
				prev = c;
			}
			System.out.println("Good");
		}
	}
}
