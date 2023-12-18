import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); // String Sを受け取る
		String T = sc.nextLine(); // String Tを受け取る
		sc.close(); // 標準入力を終了

		int ansm = T.length(); // Sを書き換える文字数の最小値

		//Sの何文字目から調べるかを全探索する
		for(int i = 0; i <= S.length() - T.length(); i++) {
			String cs = S.substring(i);
			int diff = 0; // SとTで一致しない文字数
			for(int j = 0; j < T.length(); j++) {
				if(!checkStr(cs, T, j)) {
					diff += 1;
				}
			}
			if(diff < ansm) ansm = diff; // 最小値更新
		}
		System.out.println(ansm);

	}

	// 文字列Xと文字列Yを比較し、指定したインデックスの文字が等しいか求める関数
	public static boolean checkStr(String X, String Y, int c) {
		char cX = X.charAt(c);
		char cY = Y.charAt(c);
		return cX == cY;
	}
}