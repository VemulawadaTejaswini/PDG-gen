//sucannerクラス使うためにインポート
import java.util.*;

class Main{
	//プログラムのエントリポイント
	public static void main(String[] args){
		//入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//case の回数の変数i
		int i = 0;
		//breakされるまで処理を繰り返す
		while (true) {
			//数字を受け取る
			int x = sc.nextInt();
			//変数にｘが入力されたときbreakする
			if( x == 0 ){
				break;
				
			} else {
			//繰り返すたびcase回数に＋１
			i = i+1;
			//表示
			System.out.println("Case " + i + ": " + x);
			}
		}
	}
}