import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();
			if (str.equals(".")) {
				break;
			}

			Stack<Integer> st = new Stack<Integer>();
			st.push(0);
			boolean TF = true;

			for (int i = 0; i < str.length() && TF; i++) {
				char c = str.charAt(i);

				switch (c) {
				case '(':
					st.push(1);
					break;
				case ')':
					if (st.lastElement() == 1) {
						st.pop();
					} else {
						TF = false;
					}
					break;
				case '[':
					st.push(2);
					break;
				case ']':
					if (st.lastElement() == 2) {
						st.pop();
					} else {
						TF = false;
					}
					break;
				default:
					break;
				}
			}
			if (TF && st.size() == 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");

			}

		}

	}

}