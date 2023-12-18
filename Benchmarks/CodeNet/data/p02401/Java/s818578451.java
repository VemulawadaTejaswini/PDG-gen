import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		for (int i = 1; i==0; i++) {
			Scanner sc = new Scanner(System.in);
			sc.useDelimiter("\\s");
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if (op.equals("+")) {
				System.out.println(a+b);
			} else if (op.equals("-")) {
				System.out.println(a-b);
			} else if (op.equals("*")) {
				System.out.println(a*b);
			} else if (op.equals("/")) {
				System.out.println(a/b);
			} else if (op.equals("?")) {
				break;
			}
		}

	}

}