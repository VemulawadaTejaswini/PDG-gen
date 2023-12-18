import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.equals(".")) break;
			boolean success = true;
			Deque<Character> stack = new ArrayDeque<>();
			for (int i = 0; i < str.length(); ++i) {
				char ch = str.charAt(i);
				if (ch == ')' || ch == ']') {
					if (!eliminate(ch, stack)) {
						success = false;
						break;
					}
				} else
					stack.push(ch);
			}
			if (stack.contains('(') || stack.contains('[')) {
				success = false;
			}
			System.out.println((success) ? "yes" : "no");
		}
	}
	public static boolean eliminate(char rparen, Deque<Character> stack) {
		char lparen = (rparen == ')') ? '(' : '[';
		char other = (lparen == '(') ? '[' : '(';
		int popcnt = 1;
		Iterator it = stack.iterator();
		while (it.hasNext()) {
			char ch = (char)it.next();
			if (ch == lparen) {
				for (int i = 0; i < popcnt; ++i) {
					char c = stack.remove();
					if (c == other) return false;
				}
				return true;
			}
			++popcnt;
		}
		return false;
	}
}
