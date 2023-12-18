import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner (System.in);
		ArrayList<String> result=new ArrayList<String>();
		Deque<Character> stack=new ArrayDeque<Character>(100);
		String target;
		while (!(in.hasNext("."))) {
			target=in.next();
			for (int i=0;i<target.length();i++) {
				if (target.charAt(i)=='[' || target.charAt(i)=='(') {
					stack.add(target.charAt(i));
				}
				if(!(stack.isEmpty())){
					if ((stack.getLast()=='[' && target.charAt(i)==']') || (stack.getLast()=='(' && target.charAt(i)==')')) {
						stack.removeLast();
					}
				}
			}

			if (stack.isEmpty()) {
				result.add("yes");
			}else{
				result.add("no");
				stack.clear();
			}
		}
		for (int i=0;i<result.size();i++) {
			System.out.printf("%d%n",result.get(i));
		}
	}
}