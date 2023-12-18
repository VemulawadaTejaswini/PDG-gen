import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Stack<String> stack=new Stack<String>();
			String s=sc.nextLine();
			String[] token=s.split(" ");
			for(String t:token) {
				if(t.equals("+") || t.equals("-") || t.equals("*")){ 
					int num1=Integer.valueOf((String) stack.pop());
					int num2=Integer.valueOf((String) stack.pop());
					if(t.equals("+")) {
						stack.push(String.valueOf(num1+num2));
					}
					else if(t.equals("-")) {
						stack.push(String.valueOf(num2-num1));
					}
					else {
						stack.push(String.valueOf(num1*num2));
					}
					
				}
				else {
					stack.push(t);
				}
			}
			System.out.println(stack.pop());

		}
	}
}
