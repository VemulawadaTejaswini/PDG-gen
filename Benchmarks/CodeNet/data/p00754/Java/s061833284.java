

import java.util.Scanner;
import java.util.Stack;

public class Main{
	static boolean cheak(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '.') {
				break;
			}
			if(c == '(') {
				stack.push(')');
			}
			if(c == '[') {
				stack.push(']');
			}
			if(c == ')' || c == ']') {
				if(stack.isEmpty() || stack.pop() != c) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
		
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				if(s.equals(".")) break;
				if(cheak(s)) {
					System.out.println("yes");
				}
				else System.out.println("no");
			}
		}
	}
}

