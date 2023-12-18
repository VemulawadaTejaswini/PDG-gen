import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		while (s.hasNext()) {
			int n = s.nextInt();
			if (n == 0) {
				System.out.println(st.pop());
			} else {
				st.push(n);
			}
		}
	}
}
