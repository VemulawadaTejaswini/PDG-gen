import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		while (true) {
			if (op.equals("+")) {
				System.out.println(a + b);
				a = scan.nextInt();
				op = scan.next();
				b = scan.nextInt();
			} else if (op.equals("-")) {
				System.out.println(a - b);
				a = scan.nextInt();
				op = scan.next();
				b = scan.nextInt();
			} else if (op.equals("*")) {
				System.out.println(a * b);
				a = scan.nextInt();
				op = scan.next();
				b = scan.nextInt();
			} else if (op.equals("/")) {
				System.out.println(a / b);
				a = scan.nextInt();
				op = scan.next();
				b = scan.nextInt();
			} else if (op.equals("?")) {
				break;
			}
		}
	}
}