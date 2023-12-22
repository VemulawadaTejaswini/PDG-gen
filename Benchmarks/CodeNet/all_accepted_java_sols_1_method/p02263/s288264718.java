import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		//System.in
		Scanner scanner = new Scanner(System.in);
		//split tokens by space and create a stack
		String input = scanner.nextLine();
		String[] tokens = input.split(" ");
		Stack<Integer> polishStack = new Stack<Integer>();
		scanner.close();
		
		//go through all tokens
		for (int i = 0; i < tokens.length; i++) {
			//find out if it's a number or operation
			boolean operation = false;
			try {
				Integer.parseInt(tokens[i]);
			}
			catch(NumberFormatException e) {
				operation = true;
			}
			
			//push to stack if it's a number
			if (operation != true) {
				polishStack.push(Integer.parseInt(tokens[i]));
			}
			else {
				int first = polishStack.pop();
				int second = polishStack.pop();
				
				if (tokens[i].equals("+")) {
					polishStack.push(first + second);
				}
				else if (tokens[i].contentEquals("-")) {
					polishStack.push(second - first);
				}
				else if (tokens[i].contentEquals("*")) {
					polishStack.push(first * second);
				}
				else if (tokens[i].contentEquals("/")) {
					polishStack.push(second / first);
				}
			}
		}
		
		System.out.println(polishStack.pop());
	}
}
