import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int answer = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (st.isEmpty() || st.peek() <= x) st.push(x);
			else {
				int prev = st.pop();
				while (!st.isEmpty() && st.peek() > x) st.pop();
				answer += prev - x;
				st.push(x);
			}
		}

		if (!st.isEmpty()) answer += st.peek();
		System.out.println(answer);
	}

}
