import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		Pattern p = Pattern.compile("[0-9]+");
		
		while(sc.hasNext()) {
			String s = sc.next();
			Matcher m = p.matcher(s);
			if(m.find()) stack.push(Integer.parseInt(s));
			else if(s.equals("+")) stack.push(stack.pop() + stack.pop());
			else if(s.equals("-")) stack.push(stack.pop() - stack.pop());
			else if(s.equals("*")) stack.push(stack.pop() * stack.pop());
		}
		
		System.out.println(stack.pop());
	}
}
