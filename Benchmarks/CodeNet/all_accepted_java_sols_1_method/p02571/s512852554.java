import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ss = s.toCharArray();
		String t = sc.next();
		char[] tt = t.toCharArray();
		int ans = 0;
		for (int i = 0; i <= s.length() - t.length(); i++) {
			// i = スタート地点
			// 先頭比較、0～s-tまで
			int tmp = 0;
			for (int j = 0; j < t.length(); j++) {
				if (ss[i+j] == tt[j]) {
					tmp++;
				}
			}
			if (tmp > ans) {
				ans = tmp;
			}

		}
		System.out.println(t.length() - ans);

	}
	
}
