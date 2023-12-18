import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0;
		String op = null;
		
		do {
			try {
				a = sc.nextInt();
				op = sc.next();
				b = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			if (op.equals("+")) {
				System.out.println(a + b);
			} else if (op.equals("-")) {
				System.out.println(a - b);
			} else if (op.equals("*")) {
				System.out.println(a * b);
			} else if (op.equals("/")) {
				System.out.println(a / b);
			}
		} while (!op.equals("?"));
		
	}

}