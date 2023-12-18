import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.equals(".")) {
				break;
			}
			Deque<Character> dq = new ArrayDeque<Character>();
			boolean valid = true;
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if (c == '(' || c == '[') {
					dq.offerFirst(c);
				}
				if (c == ')' || c == ']') {
					if (dq.isEmpty()) {
						valid = false;
						break;
					}
					char c2 = dq.pollFirst();
					if ((c2 == '(' && c == ']') || (c2 == '[' && c == ')')) {
						valid = false;
					}
				}
			}
			if (!dq.isEmpty()) {
				valid = false;
			}
			System.out.println(valid ? "yes" : "no");
		}
	}

}