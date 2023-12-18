import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			char op = sc.next().charAt(0);
			int b = sc.nextInt();
			int ans = -1;
			if (op == '+') {
				ans = a + b;
			} else if (op == '-') {
				ans = a - b;
			} else if (op == '*') {
				ans = a * b;
			} else if (op == '/' && b != 0) {
				ans = a / b;
			} else {
				/*
				 * if (op == '?') { break; } else { System.out.println("error");
				 */ break;
			}

			System.out.println(ans);

		}
	}
}