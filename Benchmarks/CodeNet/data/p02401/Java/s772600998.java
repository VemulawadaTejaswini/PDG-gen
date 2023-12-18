import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flg = true;
		ArrayList<Integer> list = new ArrayList<Integer>();

		int ans = 0;

		while (flg) {
			scanner.hasNext();

			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();

			if ("?".equals(op)) {
				flg = false;
				break;
			}

			switch (op) {
			case "+":
				ans = a + b;
				break;
			case "-":
				ans = a - b;
				break;
			case "/":
				ans = a / b;
				break;
			case "*":
				ans = a * b;
				break;
			}

			list.add(ans);
		}

		for (int ttt : list) {
			System.out.println(ttt);
		}

	}
}