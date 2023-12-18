import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner (System.in);
		Deque<Character> stack=new ArrayDeque<Character>();
		String target;
		while (!(in.hasNext("."))) {
			target=in.next();
			for (int i=0;i<target.length();i++) {
				if (target.charAt(i)=='[' || target.charAt(i)=='(') {
					stack.add(target.charAt(i));
				}else if ((stack.getLast()=='[' && target.charAt(i)==']') || (stack.getLast()=='(' && target.charAt(i)==')')) {
						stack.removeLast();
				}
			}
			if (stack.isEmpty()) {
				System.out.println("yes");
			}else{
				System.out.println("no");
				stack.clear();
			}
		}
	}
}