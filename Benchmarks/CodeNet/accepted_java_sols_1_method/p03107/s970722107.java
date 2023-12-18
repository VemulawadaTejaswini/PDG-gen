import java.util.Scanner;
import java.util.Stack;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(s.charAt(0)-'0');
		int count =0;
		for(int i=1;i<s.length();i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i)-'0');
			} else {
				if (stack.peek()!=(s.charAt(i)-'0')) {
					stack.pop();
					count+=2;
				} else {
					stack.push(s.charAt(i)-'0');
				}
			}
		}
		System.out.println(count);
	}
}