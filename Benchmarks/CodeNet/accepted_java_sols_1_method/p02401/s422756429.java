import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		for (int i = 0;; i++) {
			String line = sc.nextLine();
			String[] x = line.split(" ");
			int a = Integer.parseInt(x[0]);
			int b = Integer.parseInt(x[2]);
			if (x[1].equals("+")) {
				System.out.println(a + b);

			} else if (x[1].equals("-")) {
				System.out.println(a - b);

			} else if (x[1].equals("*")) {
				System.out.println(a * b);
			} else if (x[1].equals("/")) {
				System.out.println(a / b);
			} else if (x[1].equals("?")) {
				break;
			}

		}

	}

}

