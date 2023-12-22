import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		String abcd = sc.nextLine();

		int a = Integer.parseInt(abcd.substring(0, 1));
		int b = Integer.parseInt(abcd.substring(1, 2));
		int c = Integer.parseInt(abcd.substring(2, 3));
		int d = Integer.parseInt(abcd.substring(3, 4));

		for (int i = 0; i < 8; i++) {
			int op1 = (i & 4) > 0 ? 1 : -1;
			int op2 = (i & 2) > 0 ? 1 : -1;
			int op3 = (i & 1) > 0 ? 1 : -1;
			if ((a + (b * op1) + (c * op2) + (d * op3)) == 7) {
				System.out.println(answerString(a, b, c, d, op1, op2, op3));
				break;
			}
		}
		sc.close();
	}

	private String answerString(int a, int b, int c, int d, int op1, int op2, int op3) {
		StringBuilder str = new StringBuilder();
		str.append(a);
		str.append(toCharOps(op1));
		str.append(b);
		str.append(toCharOps(op2));
		str.append(c);
		str.append(toCharOps(op3));
		str.append(d);
		str.append("=7");
		return str.toString();
	}

	private char toCharOps(int op) {
		if (op == 1) {
			return '+';
		} else if (op == -1) {
			return '-';
		} else {
			throw new IllegalArgumentException();
		}
	}
}