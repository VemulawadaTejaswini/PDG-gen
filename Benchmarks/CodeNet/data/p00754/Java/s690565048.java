import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char stack[] = new char[10000];
		char[] data = new char[10000];
		String str;
		int sp;
		int match;

		Scanner sc = new Scanner(System.in);
		while (true) {
			while (true) {
				int i;
				str = sc.next();
				for (i = 0; i < str.length(); ++i) {
					data[i] = str.charAt(i);
				}
				if (data[i - 1] == '.') {
					break;
				}
			}
			if (data.equals(".")) {
				break;
			}
			match = -1;
			sp = 0;
			for (int i = 0;; ++i) {
				if (data[i] == '(' || data[i] == '[') {
					stack[sp] = data[i];
					++sp;
				} else if (data[i] == ')') {
					if (sp == 0) {
						match = 0;
					} else {
						--sp;
						if (stack[sp] != '(') {
							match = 0;
						}
					}
				} else if (data[i] == ']') {
					if (sp == 0) {
						match = 0;
					} else {
						--sp;
						if (stack[sp] != '[') {
							match = 0;
						}
					}
				} else if (data[i] == '.') {
					if (sp == 0) {
						match = 1;
					} else {
						match = 0;
					}
				}
				if (match != -1) {
					break;
				}
			}
			if (match == 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}

}

