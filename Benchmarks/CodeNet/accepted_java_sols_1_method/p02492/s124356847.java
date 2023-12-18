import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int result = 0;
			if ("+".equals(op)) {
				result = a + b;
			} else if ("-".equals(op)) {
				result = a - b;
			} else if ("*".equals(op)) {
				result = a * b;
			} else if ("/".equals(op)) {
				result = a / b;
			} else if ("?".equals(op)) {
				break;
			}
			System.out.println(result + "");
		}
	}
}