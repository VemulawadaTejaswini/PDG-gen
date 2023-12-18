import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		while (in.hasNext()) {
			int a = in.nextInt();
			char op = in.next().charAt(0);
			int b = in.nextInt();

			if (op == '?') {
				break;
			}
			switch (op) {
			case '+':
				sb.append(a + b).append("\n"); break;
			case '-':
				sb.append(a - b).append("\n"); break;
			case '*':
				sb.append(a * b).append("\n"); break;
			case '/':
				sb.append(a / b).append("\n"); break;
			default:
				break;
			}
		}
		System.out.print(sb.toString());
	}
}