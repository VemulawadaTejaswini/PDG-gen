import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		// 入力読み込み
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		// 入力終わり
		scan.close();
		// ユニコードを取得し、Nを足した配列を生成
		byte[] charNum = new byte[S.length()];
		for(int i=0;i<S.length();i++){
			int tmp=S.codePointAt(i)+N;
			// Z(90)より大きいユニコードになった場合、A(65)から数えなおす
			while(tmp>90) {
				tmp=tmp-26;
			}
			// N足した後のユニコードを格納
			charNum[i]=(byte) (tmp);
		}
		// 生成した配列から文字変換、結果出力
		for(int i=0;i<S.length();i++){
			System.out.print((char) (charNum[i]));
		}
	}
}