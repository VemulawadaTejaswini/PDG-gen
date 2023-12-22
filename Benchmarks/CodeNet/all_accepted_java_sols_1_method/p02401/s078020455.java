import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, answer = 0;
		String operator;

		while (true) {
			a = scanner.nextInt();
			operator = scanner.next();
			b = scanner.nextInt();

			if (operator.equals("+"))
				answer = a + b;
			else if (operator.equals("-"))
				answer = a - b;
			else if (operator.equals("*"))
				answer = a * b;
			else if (operator.equals("/"))
				answer = a / b;
			else if (operator.equals("?"))
				break;

			System.out.println((int) answer);
		}
	}
}