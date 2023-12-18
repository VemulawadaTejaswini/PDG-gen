import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = scanner.nextInt();;
		while (true) {
			String op = scanner.next();
			if (op.equals("=")) {
				System.out.println(result);
				break;
			}
			else if (op.equals("+")) {
				result += scanner.nextInt();
			}
			else if (op.equals("-")) {
				result -= scanner.nextInt();
			}
			else if (op.equals("*")) {
				result *= scanner.nextInt();
			}
			else if (op.equals("/")) {
				result /= scanner.nextInt();
			}
		}
		scanner.close();
	}

}

