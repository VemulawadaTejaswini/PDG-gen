import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char[] str = sc.nextLine().toCharArray();
			if (str[0] == '.') {
				break;
			}
			ArrayList<Character> a = new ArrayList<Character>();
			for (int i = 0; i < str.length; i++) {
				char b = str[i];
				if (b == '(' || b == ')' || b == '[' || b == ']') {
					a.add(b);
				}
			}

			Character[] c = a.toArray(new Character[0]);
			Stack<Character> stack = new Stack<Character>();
			boolean flg = true;
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '(' || c[i] == '[') {
					stack.push(c[i]);
				} else {
					if (stack.isEmpty()) {
						flg = false;
						break;
					}
					char tmp = stack.pop();
					if (tmp == '(' && c[i] == ')') continue;
					if (tmp == '[' && c[i] == ']') continue;
					flg = false;
					break;
				}
			}
			/*
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println();
			 */
			
			System.out.println(flg && stack.isEmpty() ? "yes" : "no");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}