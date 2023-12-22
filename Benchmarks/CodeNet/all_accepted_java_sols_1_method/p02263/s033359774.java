
import java.util.Stack;
import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String[] tokenStrings = scan.nextLine().split(" ");
		scan.close();
		Stack<Integer> tokens = new Stack<Integer>();
		for(int i = 0; i < tokenStrings.length; i++) {
			String token = tokenStrings[i];
			if(token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-")) {
				int operand1 = tokens.pop();
				int operand2 = tokens.pop();
				if(token.equals("*"))
					tokens.push(operand2 * operand1);
				else if(token.equals("/"))
					tokens.push(operand2 / operand1);
				else if(token.equals("+"))
					tokens.push(operand2 + operand1);
				else
					tokens.push(operand2 - operand1);
			}
			else
				tokens.push(Integer.parseInt(token));
			
		}

		int answer = tokens.pop();
		System.out.println(answer);
	}
}

