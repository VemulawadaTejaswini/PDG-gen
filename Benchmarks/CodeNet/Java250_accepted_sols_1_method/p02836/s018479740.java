import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		// 入力読み込み
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		// 入力終わり
		scan.close();

		// 文字列の数を取得
		int Slength = S.length();

		// 文字列を一文字ずつの配列に置き換え
		char[] tmp = S.toCharArray();

		// 回文にするために必要なハグの回数をカウントする変数
		int C = 0;

		// 両端から文字が一致しているか確認していく
		for(int i=0; i<Slength/2; i++){
			// 一致していない場合、カウント用変数をインクリメントする
			if(tmp[i]!=tmp[Slength-i-1]){
				C++;
			}
		}
		System.out.println(C);
	}
}