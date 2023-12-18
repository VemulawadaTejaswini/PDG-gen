

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			String b = scanner.next();
			int c = scanner.nextInt();
			if (b.equals("?"))
				break;
			int e = 0;
			if (b.equals("+"))
				e = a + c;
			else if (b.equals("-"))
				e = a - c;
			else if (b.equals("*"))
				e = a * c;
			else
				e = a / c;
			System.out.println(e);

		}
	}
}