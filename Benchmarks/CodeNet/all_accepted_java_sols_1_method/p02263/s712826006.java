
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] str = input.split(" ", 0); 
		sc.close();
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("+")) {
				int x = stack.pop();
				int y = stack.pop();
				stack.push(x + y);
			}else if(str[i].equals("-")) {
				int x = stack.pop();
				int y = stack.pop();
				stack.push(y - x);
			}else if(str[i].equals("*")) {
				int x = (int)stack.pop();
				int y = (int)stack.pop();
				stack.push(x * y);
			}else {
				stack.push(Integer.parseInt(str[i]));
			}
		}
		System.out.println(stack.pop());
	}
}
