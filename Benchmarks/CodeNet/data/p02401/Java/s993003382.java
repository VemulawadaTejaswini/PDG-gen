import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		loop: while (true) {
			long a = scanner.nextInt();
			String op = scanner.next();
			long b = scanner.nextInt();
			
			switch (op) {
			case "+":
				System.out.println(a + b);
				break;

			case "-":
				System.out.println(a - b);
				break;

			case "*":
				System.out.println(a * b);
				break;

			case "/":
				System.out.println(a / b);
				break;

			case "?":
				break loop;
			}
		}

		scanner.close();
	}

}

