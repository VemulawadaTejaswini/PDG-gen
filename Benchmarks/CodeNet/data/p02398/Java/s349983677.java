import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 //br.readline(); = 入力された１行分を日本語変換して返してくれる。
		 String str = br.readLine();

		 /*配列の型(intとかStringとか) [] 配列名 = 配列を用意
		  *今回はstrAryって配列にstrを入れてる。
		  *str.split = splitってのはString内に用意されてるメソッド
		  *文字列を分割するときに使用。今回は空白で区切ってって仕様なので
		  *split(" ")としてます。*/
		 String[] strAry = str.split(" ");

		 /*おなじみの文字列から数値への変換。
		  *ただし今回は指定先が配列の何番って風になってる。*/
		 int a = Integer.parseInt(strAry[0]);
		 int b = Integer.parseInt(strAry[1]);
		 int c = Integer.parseInt(strAry[2]);

		 //前準備 for文の変数iと約数の数を数える変数count
		 int i = 0;
		 int count = 0;

		 /*Constraintsを実験的にセット
		  *1?a,b,c?10000
		  *a?b
		  *この条件の場合エラーメッセージを出力している。
		  *が、本来求められていない機能のようなのでコメントアウトしておく。
		  */

		 //if(!(a < 1 || a > 10000 || b < 1 || b > 10000 || c < 1 || c > 10000 || a < b )){

			 for(i=a; i<=b; i++){
				 if( c % i == 0){count = count +1;}
			 }

		 System.out.println(count);
		 /*} else {
		  *	 System.out.println("エラー");
		 }*/
    }
}