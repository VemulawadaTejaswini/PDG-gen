import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	     String[] chars = new Scanner(System.in).nextLine().split(" ");
	     Stack<String> stack = new Stack<String>();
	     for(String s: chars) {
	    	 if(s.equals("+")) {
	    		 int b = Integer.valueOf(stack.pop()), a = Integer.valueOf(stack.pop());
	    		 stack.push(Integer.toString(a+b));
	    	 }
	    	 else if(s.equals("-")) {
	    		 int b = Integer.valueOf(stack.pop()), a = Integer.valueOf(stack.pop());
	    		 stack.push(Integer.toString(a-b));
	    	 }
	    	 else if(s.equals("*")) {
	    		 int b = Integer.valueOf(stack.pop()), a = Integer.valueOf(stack.pop());
	    		 stack.push(Integer.toString(a*b));
	    	 }
	    	 else {
	    		 stack.push(s);
	    	 }
	     }
	     System.out.println(stack.pop());
	}

}

