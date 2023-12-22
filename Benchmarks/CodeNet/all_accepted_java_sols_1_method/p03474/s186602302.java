import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt(), b = scanner.nextInt();
			String s = scanner.next();
			System.out.println(s.matches("[0-9]{" + a + "}-[0-9]{" + b + "}") ? "Yes" : "No");
		}
	}
}
