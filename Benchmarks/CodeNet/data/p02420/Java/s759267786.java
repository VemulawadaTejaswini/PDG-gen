
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String b = "";
		int c = 0;
		int sum = 0;
		while (true) {
			String a = scanner.nextLine();
			if (a.equals("-")) {
				int k = (sum + 1) % (b.length() / 2);
				System.out.println(b.substring(k, k + b.length() / 2));
				break;
			} else if (Character.isDigit(a.charAt(0)))
				sum += Integer.parseInt(a);
			else if (c == 0) {
				b = a + a;
				c = 1;
			} else {
				int k = (sum + 1) % (b.length() / 2);
				System.out.println(b.substring(k, k + b.length() / 2));
				b = a + a;
			}
		}
	}
}