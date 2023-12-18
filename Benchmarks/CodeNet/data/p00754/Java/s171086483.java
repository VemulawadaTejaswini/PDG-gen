
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			String buffer = sc.nextLine();
			if (buffer.equals(".")) {
				break;
			}
			LinkedList<Character> q = new LinkedList<Character>();
			boolean ok = true;
			for (char ch : buffer.toCharArray()) {
				if (ch == ')') {
					if (q.isEmpty()) {
						ok = false;
						break;
					}
					char ch2 = q.removeLast();
					if (ch2 != '(') {
						ok = false;
						break;
					}
				}
				if (ch == ']') {
					if (q.isEmpty()) {
						ok = false;
						break;
					}
					char ch2 = q.removeLast();
					if (ch2 != '[') {
						ok = false;
						break;
					}
				}
				if (ch == '(' || ch == '[') {
					q.addLast(ch);
				}
			}
			if(!q.isEmpty()){
				ok = false;
			}
			System.out.println(ok?"yes":"no");
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}