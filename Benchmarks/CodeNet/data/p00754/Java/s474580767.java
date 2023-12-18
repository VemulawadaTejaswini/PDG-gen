import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		String s;
		Stack<Character> stack = new Stack<Character>();
		W:while (true) {
			s = sc.nextLine();
			if (s.equals(".")) break;
			char[] letters = s.toCharArray();
			for (int i = 0; i < letters.length-1; i++) {
				switch(letters[i]) {
				case '(':
					stack.add('('); break;
				case ')':
					if (stack.isEmpty() || stack.pop() != '(') {
						out.println("no");
						continue W;
					}
					break;
				case '[':
					stack.add('['); break;
				case ']':
					if (stack.isEmpty() || stack.pop() != '[') {
						out.println("no");
						continue W;
					}
					break;
				}
			}
			out.println("yes");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}