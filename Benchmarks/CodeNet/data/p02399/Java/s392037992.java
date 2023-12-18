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

		 int d =	a / b;		//d(a÷bの整数を表示)
		 int r =	a % b;		//r(a÷bの余りを表示)
		 double f = (double)a / (double)b;	//f(a÷bの浮動小数点を表示)

		 /*今回は桁数出すためprintfを使用
		  * % = 文字表示用
		  * d = 10進数の整数
		  * %d = 10進数の整数を文字表示、みたいな使い方
		  * .7で小数点以下を７桁表示してる
		  * \nは改行用
		  */
		 System.out.printf("%d %d %.7f\n", d, r, f);

    }
}