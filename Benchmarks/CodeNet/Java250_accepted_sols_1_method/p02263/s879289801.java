import java.util.*;

public class Main {

	public static void main(String args[]) {
		Stack<Integer> myStack = new Stack<Integer>();
		
		Scanner in = new Scanner(System.in);
		String problem = in.nextLine();
		
		Scanner problemScanner = new Scanner(problem);
		
		while(problemScanner.hasNext()) {
			if(problemScanner.hasNextInt()) {
				myStack.push(problemScanner.nextInt());
			}
			else {
				String operator = problemScanner.next();
				
				int a = myStack.pop();
				int b = myStack.pop();
				
				switch(operator) {
				case "+" : myStack.push(a + b);
				break;
				case "-" : myStack.push(b - a);
				break;
				case "*" : myStack.push(b * a);
				break;
				default : break;
				}
			}
			
			
		}
		
		System.out.println(myStack.pop());
		
		
		
		
	}

}
