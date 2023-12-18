import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> calculator = new ArrayList<>();

		while (true) {
			String input = s.nextLine();
			String[] result = input.split(" ");
			int a = Integer.parseInt(result[0]);
			String op = result[1];
			int b = Integer.parseInt(result[2]);
			if (op.equals("?")) {
				break;
			}
			if (a >= 0 && a <= 20000 && b >= 0 && b <= 20000) {
				if (op.equals("+")) {
					calculator.add(a + b);
				} else if (op.equals("-")) {
					calculator.add(a - b);
				} else if (op.equals("*")) {
					calculator.add(a * b);
				} else if (op.equals("/")) {
					if (b != 0) {
						calculator.add(a / b);
					}
				}

			}

		}
		for (int i = 0; i < calculator.size(); i++) {
			System.out.println(calculator.get(i));
		}

	}
}