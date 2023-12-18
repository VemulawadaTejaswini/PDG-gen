
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

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
		int p = 0;
		int b = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				p++;
			} else if (s.charAt(i) == '[') {
				b++;
			} else if (s.charAt(i) == ')') {
				p--;
				if (p < 0)
					return false;
			} else if (s.charAt(i) == ']') {
				b--;
				if (b < 0)
					return false;
			}
		}
		if (p == 0 && b == 0)
			return true;

		return false;
	}

}