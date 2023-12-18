import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		double stack[];
		int stackIndex;

		stack = new double[100];
		while (sc.hasNext()) {
			stackIndex = 0;
			str = sc.nextLine().split(" ");
			for (int i = 0; i < str.length; i++) {
				if (!str[i].equals("+") && !str[i].equals("-") && !str[i].equals("*") && !str[i].equals("/")) {
					stack[stackIndex++] = Double.valueOf(str[i]);
				} else if (str[i].equals("+")) {
					stack[stackIndex - 2] = stack[stackIndex - 2] + stack[stackIndex - 1];
					stackIndex--;
				} else if (str[i].equals("-")) {
					stack[stackIndex - 2] = stack[stackIndex - 2] - stack[stackIndex - 1];
					stackIndex--;
				} else if (str[i].equals("*")) {
					stack[stackIndex - 2] = stack[stackIndex - 2] * stack[stackIndex - 1];
					stackIndex--;
				} else if (str[i].equals("/")) {
					stack[stackIndex - 2] = stack[stackIndex - 2] / stack[stackIndex - 1];
					stackIndex--;
				}
			}
			System.out.println(stack[0]);
		}
	}
}