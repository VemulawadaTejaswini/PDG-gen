import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(true) {

			int a = in.nextInt();
			String op = in.next();
			int b = in.nextInt();

			if(op.equals("+")) {
				System.out.println(a + b);
			}else if(op.equals("-")) {
				System.out.println(a - b);
			}else if(op.equals("*")) {
				System.out.println(a * b);
			}else if(op.equals("/")) {
				System.out.println(a / b);
			}else if(op.equals("?")) {
				break;
			}
		}
	}
}