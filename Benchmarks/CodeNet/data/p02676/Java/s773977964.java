import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int k = scanner.nextInt();
			String s = scanner.next();
			System.out.println((k >= s.length()) ? s : s.substring(0, k) + "...");
		}
	}
}
