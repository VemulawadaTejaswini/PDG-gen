

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		String op, str;
		str = "";

		while (true) {
			a = scan.nextInt();
			op = scan.next();
			// op?????????\??£?????´??????????????????????????????
			if (op.equals("?")) {
				break;
			}
			b = scan.nextInt();

			if (op.equals("-")) {
				str = str + Integer.toString(a - b) + "\n";
			}
			if (op.equals("+")) {
				str = str + Integer.toString(a + b) + "\n";
			}
			if (op.equals("*")) {
				str = str + Integer.toString(a * b) + "\n";
			}
			if (op.equals("/")) {
				str = str + Integer.toString(a / b) + "\n";
			}
		}
		
		System.out.print(str);
		
	}
}