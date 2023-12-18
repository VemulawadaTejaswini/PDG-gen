import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		;
		int a, b;

		while (true) {

			a = sc.nextInt();
			s = sc.next();
			b = sc.nextInt();

			if (s.equals("+")) {
				System.out.println(a + b);
			} else if (s.equals("-")) {
				System.out.println(a - b);
			} else if (s.equals("*")) {
				System.out.println(a * b);
			} else if (s.equals("/")) {
				System.out.println(a / b);
			} else {
				break;
			}

		}

	}

}