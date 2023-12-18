import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//変数//
		int SL;			//盤上の初期状態の長さ
		int group;		//同じ色ごとに分けた場合の数
		
		char s;			//Sから取り出した文字
		char bs;		//一回前の↑の文字
		
		String S;		//盤上の状態		
		
		Scanner scan = new Scanner(System.in);
		
		//入力//
		S = scan.nextLine();
		
		scan.close();
		
		//処理//
		//長さを取得
		SL = S.length();
		
		//初期処理
		group = 1;
		
		for(int i = 1; i < SL; i++){
			//指定位置の文字を取り出す
			s = S.charAt(i);
			
			//一つ前の文字を取得する
			bs = S.charAt(i - 1);
			
			//一つ前の状態と一致しなければgroupをインクリメント
			if( s != bs ){
				group++;
			}			
		}
		
		//結果//
		System.out.println(group - 1);

	}

}
