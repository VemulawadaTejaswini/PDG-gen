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
		 int a =  Integer.parseInt(strAry[0]);
		 int b =  Integer.parseInt(strAry[1]);

		 /*今回は条件分岐と出力の組み合わせ。
		  *if文を使って状況によって出力する文面を変えてます。*/
		 if(a < b){
			 System.out.println("a < b");
		 } else if(a > b){
			 System.out.println("a > b");
		 } else
			 System.out.println("a == b");
	}
}