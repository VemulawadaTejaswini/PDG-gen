import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static final int MAX = 123456 * 2;
	public static final int SQT = (int) Math.ceil(Math.sqrt(MAX));
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final String input = sc.nextLine();
			
			if(".".equals(input)){
				break;
			}
			
			final char[] in_ch = input.toCharArray();
			
			Stack<Character> stack = new Stack<Character>();
			
			boolean flag = true;
			for(char in : in_ch){
				if(in == '(' || in == '['){
					stack.add(in);
				}if(in == ')'){
					if(stack.isEmpty() || stack.pop() != '('){
						flag = false;
						break;
					}
				}else if(in == ']'){
					if(stack.isEmpty() || stack.pop() != '['){
						flag = false;
						break;
					}
				}
			}
			
			flag &= stack.isEmpty();
			
			System.out.println(flag ? "yes" : "no");
		}
	}

}