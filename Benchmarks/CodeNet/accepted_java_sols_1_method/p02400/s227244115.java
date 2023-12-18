/** 半径 r の円の面積と円周の長さを求めるプログラムを作成して下さい。
 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;
class Main{
	//プログラムのエントリポイント
	public static void main(String[] args){
		//入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//数字を１つうけとる
		double dbr = sc.nextDouble();
		//mathクラスから円周率を変数dbensuuに入れる
		double dbensyuu = Math.PI;
		//結果表示
		//表示時、浮動小数は5桁までに設定して表示
		System.out.printf("%.5f  %.5f" ,  dbr * dbr * dbensyuu , (dbr + dbr) * dbensyuu);
	}
}