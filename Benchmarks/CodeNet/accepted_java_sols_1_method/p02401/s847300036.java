import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10000; i++) {
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
			if (op.equals("?")) {
				break;
			} else if (op.equals("+")) {
				System.out.println(a + b);
			} else if (op.equals("-")) {
				System.out.println(a - b);
			} else if (op.equals("*")) {
				System.out.println(a * b);
			} else if (op.equals("/")) {
				System.out.println(a / b);
			}
		}
	}

}