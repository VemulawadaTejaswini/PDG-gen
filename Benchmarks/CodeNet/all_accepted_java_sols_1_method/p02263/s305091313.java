import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int stack[] = new int[1000];

		Scanner scanner = new Scanner(System.in);
		int counta = 0;
		String input[] = (scanner.nextLine()).split(" ");

		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("*")) {
				stack[counta - 2] = stack[counta - 2] * stack[counta - 1];
				counta--;
			} else if (input[i].equals("+")) {
				stack[counta - 2] = stack[counta - 2] + stack[counta - 1];
				counta--;

			} else if (input[i].equals("-")) {
				stack[counta - 2] = stack[counta - 2] - stack[counta - 1];
				counta--;

			} else {
				stack[counta] = Integer.parseInt(input[i]);
				counta++;
			}
		}
		System.out.println(stack[counta - 1]);
	}

}
