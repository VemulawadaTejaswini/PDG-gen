import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		while(true) {
			String S = sc.nextLine();
			if(S.length() == 1 && S.charAt(0) == '.') break;
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				if(c == '(' || c == ')' || c == '[' || c == ']') {
					sb.append(c);
				}
			}
			int l = sb.length();
			Deque<Character> stack = new ArrayDeque<Character>();
			for(int i = 0; i < l; i++) {
				char c = sb.charAt(i);
				if(c == '(' || c == '[') {
					stack.addFirst(c);
				}else if(c == ')' || c == ']'){
					if(stack.isEmpty()) {
						stack.addFirst(' ');
						break;
					}
					char t = stack.getFirst();
					if(t == '(' && c == ')' || t == '[' && c == ']') {
						stack.removeFirst();
					}else {
						stack.addFirst(' ');
						break;
					}
				}
			}
			if(stack.isEmpty()) {
				ans.append("yes").append("\n");
			}else {
				ans.append("no").append("\n");
			}
		}
		sc.close();
		System.out.print(ans.toString());
	}
}
