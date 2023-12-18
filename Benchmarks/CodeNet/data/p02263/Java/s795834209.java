import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack();
		String str = sc.nextLine();
		int x, y;
		for (String s : str.split(" ")) {
			if (s.equals("+") || s.equals("-") || s.equals("*")) {
				switch (s) {
				case "+":
					y = st.pop();
					x = st.pop();
					st.push(x + y);
					break;
				case "-":
					y = st.pop();
					x = st.pop();
					st.push(x - y);
					break;
				case "*":
					y = st.pop();
					x = st.pop();
					st.push(x * y);
					break;
				}
			} else {
				st.push(Integer.parseInt(s));
			}
		}
		System.out.println(st.pop());
		sc.close();
	}
}

