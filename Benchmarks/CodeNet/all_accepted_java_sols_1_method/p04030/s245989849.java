import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (ch == 'B') {
				if (!stack.isEmpty()) stack.pop();
			} else {
				stack.push(ch);
			}
		}
		String res = "";
		while (!stack.isEmpty()) {
			res += stack.pop();
		}
		for (int i = res.length() - 1; i >= 0; --i) {
			System.out.print(res.charAt(i));
		}
	}
}