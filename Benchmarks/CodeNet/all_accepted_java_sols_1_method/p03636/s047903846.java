import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();

			System.out.println(String.format("%s" + "%d" + "%s",
					s.charAt(0), s.substring(1, s.length() - 1).length(), s.charAt(s.length() - 1)));

		}
	}
}