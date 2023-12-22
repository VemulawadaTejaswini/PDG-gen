import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 文字列を取得
		String S = sc.next();
		
		for (int i=0; i < S.length(); i++) {
			char c = S.charAt(i);
			// UならOK
			if (c == 'U')
				continue;
			// DならOK
			if (c == 'D')
				continue;
			
			//偶数番目
			if (i%2 == 0) {
				// LならOK
				if (c == 'R')
					continue;
			}
			//奇数番目
			else {
				// RならOK
				if (c == 'L')
					continue;
			}
			
			//ここまでに引っかからなかったらNoを出力して終了
			System.out.println("No");
			return;
		}
		
		//全部通ったらYesを出力
		System.out.println("Yes");
	}
}
