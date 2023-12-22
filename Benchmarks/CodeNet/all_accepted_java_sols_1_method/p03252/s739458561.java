import java.util.*;

public class Main {
	public static void main(String[] args) {
		boolean ontToOne = true;
		Scanner sc = new Scanner(System.in);
		// 文字列の標準入力
		String s = sc.next();
		String t = sc.next();
		// 英小文字置換表の作成
		int[][] swap = new int[26][26];
		for(int i = 0; i < s.length(); i++) {
			swap[s.charAt(i) - 'a'][t.charAt(i) - 'a'] = 1;
		}
		// 2文字列間で英小文字が1対1で対応しているか
		for(int i = 0; i < 26; i++) {
			int sToT = 0;
			int tToS = 0;
			for(int j = 0; j < 26; j++) {
				// 文字列sから文字列tの置換パターンが存在するか
				if(swap[i][j] == 1) {
					sToT++;
				}
				// 文字列tから文字列sの置換パターンが存在するか
				if(swap[j][i] == 1) {
					tToS++;
				}
				// 置換パターンが1対1よりも存在するか
				if(sToT >= 2 || tToS >= 2) {
					ontToOne = false;
				}
			}
		}
		// 結果出力
		if(ontToOne) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}