import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			String x = scanner.next();
			int b = scanner.nextInt();

			if (x.equals("+"))
				System.out.println(a + b);
			else if (x.equals("-"))
				System.out.println(a - b);
			else if (x.equals("*"))
				System.out.println(a * b);
			else if (x.equals("/"))
				System.out.println(a / b);
			else if (x.equals("?"))
			        break;
		}
	}
}
