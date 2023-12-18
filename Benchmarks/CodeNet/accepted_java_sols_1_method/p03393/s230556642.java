import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashSet<Character> set = new HashSet<>();
		//使っている文字をsetに追加
		for (char c : s.toCharArray()) {
			set.add(c);
		}

		if (s.length() != 26) {
			for (char c = 'a'; c <= 'z'; c++) {
				if (set.contains(c)) {
					continue;
				} else {
					System.out.println(s + c);
					return;
				}
			}
		}

		for (int i = s.length() - 1; i > 0; i--) {
			String ss = s.substring(i);//後ろから切り取っていく
			String a = s.substring(0, i - 1);//その余り-1
			//切り取った部分を削除
			for (char c : ss.toCharArray()) {
				set.remove(c);
			}
			
			for (char c = s.charAt(i - 1); c <= 'z'; c++) {
				if (set.contains(c)) {
					continue;
				} else {
					System.out.println(a + c);
					return;
				}
			}
			//切り取った部分を追加
			for (char c : ss.toCharArray()) {
				set.add(c);
			}
		}
		System.out.println(-1);
	}
}