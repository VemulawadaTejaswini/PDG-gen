import java.util.*;
public class Main {
	
	public static Boolean isOperator(String s) {
		
			return s.equals("+") || s.equals("-") || s.equals("*");
		
	}
	
	public static int calculate(int n, int n2, String op) {
		if(op.equals("+")) {
			return n + n2;
		}
		
		else if(op.equals("-")) {
			return n2 - n;
		}
		
		else return n * n2;
	}

	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		Stack<Integer> nums = new Stack<Integer>();
		
		
		String s = in.nextLine();
		String [] input = s.split(" ");
		
		
		
		for(int i = 0; i < input.length; i++){
			String next  = input[i];
			
			
			if(isOperator(next)) {
				int n = nums.pop();
				int n2 = nums.pop();
				int newNum = calculate(n, n2, next);
				nums.push(newNum);
				
				
			}
			
			else {
				
				int n = Integer.parseInt(next);
				nums.push(n);
			}
			
		}
		
		System.out.println(nums.pop());
		
		
		
		
		
		
		
	
	}
}

