
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			Stack<String> stack = new Stack<String>();
			String str = sc.nextLine();
			String[] token = str.split(" ");
			for(String t : token) {
				if( t.equals("+") || t.equals("-") || t.equals("*") ) { 
					int first = Integer.parseInt( stack.pop() );
					int second = Integer.parseInt( stack.pop() );
					if(t.equals("+")) {
						stack.push( Integer.toString(first + second) );
					}
					else if( t.equals("-") ) {
						stack.push( Integer.toString(second - first) );
					}
					else {
						stack.push( Integer.toString(first * second) );
					}
					
				}
				else {
					stack.push(t);
				}
			}
			System.out.println( stack.pop() );

		}
	}
}
