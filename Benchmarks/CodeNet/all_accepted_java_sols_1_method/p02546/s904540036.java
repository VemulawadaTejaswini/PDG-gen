import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println(s + ('s' == s.charAt(s.length() - 1) ? "es" : "s"));
		}
	}
}
