import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		char alphabet = 'a';
		// アルファベットを格納する配列
		char[] alphabets = new char[26];
		// アルファベットの数をカウントする配列
		int[] count = new int[26];

		// 配列の中にアルファベットを格納
		for (int i = 0; i < 26; i++) {
			alphabets[i] = alphabet++;
		}

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			String sentence = scan.nextLine().toLowerCase();
			if (sentence.length() == 0) { // 文字列が空(長さゼロ)の場合
				break;
			}
			for (int i = 0; i < sentence.length(); i++) {
				for (int j = 0; j < 26; j++) {
					// 配列の要素と文字が同じとき
					if (alphabets[j] == sentence.charAt(i)) {
						// アルファベットをカウント
						count[j]++;
					}
				}
			}
		}
		// アルファベットのカウントを出力
		for (int i = 0; i < 26; i++) {
			System.out.println(alphabets[i] + " " + ":" + " " + count[i]);
		}
		scan.close();
	}
}

