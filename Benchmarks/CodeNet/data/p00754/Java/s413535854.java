import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		stdIn.useDelimiter("\\.");
		Stack<Character> stack;
		while(true) {
			String tmp = stdIn.nextLine();
			if(tmp.length() == 1) break;
			stack = new Stack<Character>();
			boolean isYes = true;
			for(int i = 0; i < tmp.length(); i++) {
				if(tmp.charAt(i) == '(') {
					stack.push('(');
				}
				if(tmp.charAt(i) == '[') {
					stack.push('[');
				}
				if(tmp.charAt(i) == ')') {
					if(stack.isEmpty() || stack.pop() != '(') {
						isYes = false;
					}
				}
				if(tmp.charAt(i) == ']') {
					if(stack.isEmpty() || stack.pop() != '[') {
						isYes = false;
					}
				}
				if(!isYes) {
					break;
				}
			}
			System.out.println((isYes)?"yes":"no");
		}
		
	}
	
}