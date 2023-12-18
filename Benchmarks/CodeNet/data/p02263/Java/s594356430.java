import java.util.*;

public class Main {
	
	public static int polish(String[] equation) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		
		while(index < equation.length) {
			
			while(!equation[index].equals("+") & !equation[index].equals("-") & !equation[index].equals("*") & !equation[index].equals("/")) {
				stack.push(Integer.parseInt(equation[index]));
				index++;
			}
			
			if(equation[index].equals("+")) {
				
				int temp = stack.pop() + stack.pop();
				stack.push(temp);
				
			}
			else if(equation[index].equals("-")) {
				
				int first = stack.pop();
				int second = stack.pop();
				int temp = second - first;
				stack.push(temp);
				
			}
			else if(equation[index].equals("*")) {
				
				int temp = stack.pop() * stack.pop();
				stack.push(temp);
				
			}
			index++;
			
		}
		
		return stack.pop();
		
	}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] equation = line.split(" ");
		
		int result = polish(equation);
		System.out.println(result);
		
		in.close();

	}

}
