
import java.util.Scanner;
import java.util.Stack;	

public class Main {
	public static void main(String[] args) {
		//System.out.println("t");
		
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		
		int value = 0;
		
		while(scan.hasNext()) {
			String e = scan.next();
			if(e.equals("+")) {
				stack.push(stack.pop() + stack.pop());
			} else if(e.equals("-")) {
				stack.push(-1*(stack.pop() - stack.pop()));
			} else if(e.equals("*")) {
				stack.push(stack.pop() * stack.pop());
			}else {
				stack.push(Integer.parseInt(e));
			}
			value = stack.peek();
			//System.out.println(value);
		}
		//System.out.println("here");
		System.out.println(value);
		
	}
}

