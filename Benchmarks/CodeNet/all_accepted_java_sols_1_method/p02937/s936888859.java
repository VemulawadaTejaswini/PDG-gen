import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();

		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		long N = s.length();

		// アルファベット分TreeSetを用意
		TreeSet<Integer>[] sets = new TreeSet[26];
		for (int i = 0; i < sets.length; i++) {
			sets[i] = new TreeSet<Integer>();
		}

		// アルファベットに要素順を設定
		for (int i=0; i < sChars.length; i++) {
			sets[sChars[i] - 'a'].add(i);
		}

		int lastIndex = 0;
		long ans = 0;
		for (char c : tChars) {
			Integer tmpIndex = sets[c - 'a'].ceiling(lastIndex);
			if (tmpIndex == null) {
				lastIndex = 0;
				ans += N;
				tmpIndex = sets[c - 'a'].ceiling(lastIndex);
				if (tmpIndex == null) {
					System.out.println(-1);
					return;
				}
			}
			lastIndex = tmpIndex + 1;
		}
		ans = ans + (long)(lastIndex);
		System.out.println(ans);
	}
}
