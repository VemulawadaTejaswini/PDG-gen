
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (sc.hasNext()) {
			
			String str = sc.next();
			if (str.charAt(0) == '+') {
				a = myStack.pop();
				b = myStack.pop();
				myStack.push(b + a);
			}
			else if (str.charAt(0) == '-') {
				a = myStack.pop();
				b = myStack.pop();
				myStack.push(b - a);
			}
			else if (str.charAt(0) == '*') {
				a = myStack.pop();
				b = myStack.pop();
				myStack.push(b * a);
			}
			else if (str.charAt(0) == '/') {
				a = myStack.pop();
				b = myStack.pop();
				myStack.push(b / a);
			}
			else {
				myStack.push(Integer.parseInt(str));
			}
		}
		System.out.println(myStack.pop());
	}
}

