import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			String s = scanner.next();
			if (s.contains("AC")) {
				System.out.println("Yes");
				return ;
			}
			System.out.println("No");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
