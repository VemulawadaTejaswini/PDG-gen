
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author kumar1
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			solve();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * @throws IOException
	 * 
	 */
	private static void solve() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		LinkedList<Boolean> ans = new LinkedList<Boolean>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s = in.readLine()).equals(".")) {
			ans.add(isBalanced(s));
		}

		Iterator<Boolean> it = ans.iterator();
		while (it.hasNext()) {
			if (it.next()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	/**
	 * @param s
	 * @return
	 */
	private static boolean isBalanced(String s) {
		// TODO 自動生成されたメソッド・スタブ]
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else if (s.charAt(i) == ')' || s.charAt(i) == ']') {
				try {
					char u = st.pop();
					if (u != ((s.charAt(i) == ')') ? '(' : '[')) {
						return false;
					}
				} catch (EmptyStackException e) {
					return false;
				}
			}
		}
		if (st.size() == 0)
			return true;

		return false;
	}

}