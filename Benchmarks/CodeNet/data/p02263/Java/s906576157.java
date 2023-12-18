import java.util.Scanner;

public class Main {
	static int stack[] = new int[1000];
	static int counta = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input[] = (scanner.nextLine()).split(" ");

		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("*")) {
				push(pop() * pop());

			} else if (input[i].equals("+")) {
				push(pop() + pop());

			} else if (input[i].equals("-")) {
				push(-pop() + pop());

			} else {
				push(Integer.parseInt(input[i]));

			}
		}
		System.out.println(pop());
	}

	public static int pop() {
		counta--;
		return stack[counta + 1];
	}

	public static void push(int i) {
		counta++;
		stack[counta] = i;
	}
}
