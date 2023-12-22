import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		String op;
		double b;

		while (sc.hasNext()) {
			a = sc.nextDouble();
			op =sc.next();
			b = sc.nextDouble();
			
			if (op.equals("+")) {
				System.out.println((int)(a+b));
			}
			else if (op.equals("-")) {
				System.out.println((int)(a-b));
			}
			else if (op.equals("*")) {
				System.out.println((int)(a*b));
			}
			else if (op.equals("/")) {
				System.out.println((int)(a/b));
			}
			else if (op.equals("?")) {
				break;
			}
		}
	}
}