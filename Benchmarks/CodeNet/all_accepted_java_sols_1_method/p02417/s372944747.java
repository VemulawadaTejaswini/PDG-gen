

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//26個の型を用意する(A～Zの分)
		int[] cnt = new int[26];

//入力待ち状態
		while (sc.hasNext()) {
//行単位で取り出す
			String S = sc.nextLine();
//全て小文字に変換
			S = S.toLowerCase();
//String型をchar型に変換
			char[] cs = S.toCharArray();

			for (int i = 0; i < cs.length; i++) {
//アスキーコードの割り当てを比べる
				if (cs[i] >= 'a' && cs[i] <= 'z') {
//アスキーコードの割り当てると対応した番号が得られる(数値として計算する)
					cnt[cs[i] - 'a']++;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
//char型に戻して表示
			System.out.println((char) (i + 'a') + " : " + cnt[i]);
		}
	}
}
