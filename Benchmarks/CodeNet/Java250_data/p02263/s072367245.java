import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String next;
		int op1, op2;
		Stack<Integer> stack = new Stack<Integer>();

		while(scanner.hasNext()){
			next = scanner.next();
			switch(next){
				case "+":
					op1 = stack.pop();
					op2 = stack.pop();
					stack.push(op2+op1);
					break;
				case "-":
					op1 = stack.pop();
					op2 = stack.pop();
					stack.push(op2-op1);
					break;
				case "*":
					op1 = stack.pop();
					op2 = stack.pop();
					stack.push(op2*op1);
					break;
				default :
					stack.push(Integer.parseInt(next));
			}
		}

		System.out.println(stack.pop());

	}
}