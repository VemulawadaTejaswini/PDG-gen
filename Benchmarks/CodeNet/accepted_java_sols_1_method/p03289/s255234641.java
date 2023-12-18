import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		scanner.close();

		int count = 0;
		for (int n = 0; n < S.length(); n++) {
			String c = S.substring(n, n + 1);

			if (n == 0) {
				if (!c.equals("A")) {
					System.out.println("WA");
					return;
				}
				continue;
			}

			if (n == 1 || n == S.length() - 1) {
				if (!c.equals("A") && Character.isUpperCase(S.charAt(n))) {
					System.out.println("WA");
					return;
				}
				continue;
			}

			if (c.equals("C") && count == 0) {
				count++;
				continue;
			}

			if (Character.isUpperCase(S.charAt(n))) {
				System.out.println("WA");
				return;
			}
		}
		if (count == 0) {
			System.out.println("WA");
			return;
		}
		System.out.println("AC");
	}
}
