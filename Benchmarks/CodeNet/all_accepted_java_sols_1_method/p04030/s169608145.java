import java.util.Scanner;
import java.util.Stack;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> st = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'B') {
				if(st.isEmpty()) {
					continue;
				}
				st.pop();
			} else {
				st.add(c);
			}
		}
		int N = st.size();
		char[] result = new char[N];
		for(int i=0; i<N; i++) {
			result[N-i-1] = st.pop();
		}
		System.out.println(result);
	}
}