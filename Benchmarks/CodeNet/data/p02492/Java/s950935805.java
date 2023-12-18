import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b, ans;
		char op;
		while (true) {
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			op = sc.next().charAt(0);
			b = sc.nextInt();
			if (op == '+') {
				ans = a + b;
			} else if (op == '-') {
				ans = a - b;
			} else if (op == '*') {
				ans = a * b;
			} else if (op == '/') {
				ans = a / b;
			} else if (op == '?') {
				break;
			} else {
				System.out.println("error");
				break;
			}

			System.out.println(ans);

		}
	}
}