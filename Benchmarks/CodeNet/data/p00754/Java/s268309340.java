import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			char[] cs = sc.nextLine().toCharArray();
			if (cs[0] == '.') break;
			System.out.println(solve(cs) ? "yes" : "no");
		}
	}

	static boolean solve(char[] cs) {
		ArrayList<Character> stack = new ArrayList<Character>();
		for (char c : cs) {
			if (c == '(' || c == '[') {
				stack.add(c);
			} else if (c == ')') {
				if (!stack.isEmpty() && stack.get(stack.size() - 1) == '(') {
					stack.remove(stack.size() - 1);
				} else {
					return false;
				}
			} else if (c == ']') {
				if (!stack.isEmpty() && stack.get(stack.size() - 1) == '[') {
					stack.remove(stack.size() - 1);
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}