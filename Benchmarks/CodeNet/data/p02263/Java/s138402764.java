import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");

		Deque<Integer> stack = new ArrayDeque<Integer>();

		for(int i = 0; i < input.length; i++) {
			if(input[i].equals("+") || input[i].equals("-")
					|| input[i].equals("*") || input[i].equals("/")) {
				switch(input[i]) {
				case "+":
					stack.push(stack.pop() + stack.pop());
					break;
				case "-":
					stack.push(stack.pop() - stack.pop());
					break;
				case "*":
					stack.push(stack.pop() * stack.pop());
					break;
				case "/":
					stack.push(stack.pop() / stack.pop());
					break;
				}

			} else {
				stack.push(Integer.parseInt(input[i]));
			}
		}
		System.out.println(stack.pop());
		scan.close();
	}
}
