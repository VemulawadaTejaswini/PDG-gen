import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a, b;
			String op;
			while (true) {
				a = sc.nextInt();
				op = sc.next();
				b = sc.nextInt();
				if (op.equals("?")) {
					break;
				}
				System.out.println(calc(a, op, b));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int calc(int a, String op, int b) {
		switch (op) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		default:
			throw new RuntimeException();
		}
	}
}