import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>(); 
		Scanner in = new Scanner(System.in);
		String stringIn = in.nextLine();
		String[] lineString = stringIn.split(" ");
		for(int i = 0; i<lineString.length;i++) {
			if(lineString[i].equals("*")) {
				int n = stack.pop()*stack.pop();
				stack.push(n);
			}
			else if(lineString[i].equals("+")) {
				int n = stack.pop()+stack.pop();
				stack.push(n);
			}
			else if(lineString[i].equals("-")) {
				int n1 = stack.pop();
				int n2 = stack.pop();
				int n = n2-n1;
				stack.push(n);
			}
			else {
			stack.push(Integer.parseInt(lineString[i]));	
			} 
			//System.out.println(stack.toString());
			
		}
		result = stack.pop();
		System.out.println(result);
	}

}
