import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		while (true) {
			int a = sc1.nextInt();
			String op = sc1.next();
			int b = sc1.nextInt();

			if (op.equals("+")) {
				System.out.println(a + b);
			}
			else if (op.equals("-")) {
				System.out.println(a - b);
			}
			else if (op.equals("*")) {
				System.out.println(a * b);
			}
			else if (op.equals("/")) {
				System.out.println(a / b);
			}
			else {
				break;
			}
		}

		sc1.close();

	}

}
