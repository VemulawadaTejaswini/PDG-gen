import java.util.Scanner;
/** 参考: https://beta.atcoder.jp/contests/abc103/submissions/2877427 */
public class Main {
	public static void main(String[] args) {
		// ここは Scanner in のほうがわかりやすいだろうか？
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		for (int i = 0; i < t.length(); i++) {
			// tmpでもよかったけどSの途中経過ってことがわかるようにs_tmpにした
			String s_tmp = s.substring(i) + s.substring(0, i);
			if (s_tmp.equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}