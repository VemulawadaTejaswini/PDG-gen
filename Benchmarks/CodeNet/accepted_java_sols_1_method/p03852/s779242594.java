import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);

		if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
			System.out.println("vowel");
			return;
		}
		System.out.println("consonant");
	}
}
