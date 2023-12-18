import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		while (op != "?") {
			if (op.equals("+")) {
				System.out.println(a + b);
				op = scan.next();
			} else if (op.equals("-")) {
				System.out.println(a - b);
				op = scan.next();
			} else if (op.equals("*")) {
				System.out.println(a * b);
				op = scan.next();
			} else if (op.equals("/")) {
				System.out.println(a / b);
				op = scan.next();
			}
		}
	}
}