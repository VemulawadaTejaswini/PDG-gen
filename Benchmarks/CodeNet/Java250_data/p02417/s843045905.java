import java.util.Scanner;

public class Main {

	// a～zの文字数を記録する配列
	static int[] CharCount = new int[26];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ctrl+Zが押されるまで繰り返す
		while (sc.hasNext()) {
			// 入力と文字カウント
			CountingCharacters(sc.next());
		}
		// 表示
		Print();

	}

	// 文字列からa~zの文字をカウントする（大小文字区別なし）
	static void CountingCharacters(String str) {

		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int a = (int) 'A'; a < 1 + (int) 'Z'; a++) {
				if (Character.toUpperCase(c[i]) == (char) a) {
					CharCount[a - (int) 'A']++;
					break;
				}
			}
		}
	}

	// 表示処理
	static void Print() {
		for (int i = 0; i < CharCount.length; i++) {
			System.out.println((char) (i + (int) 'a') + " : " + CharCount[i]);
		}
	}

}
