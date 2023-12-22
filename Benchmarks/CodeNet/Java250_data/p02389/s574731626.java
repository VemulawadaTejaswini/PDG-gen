import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 //今回の問題では求められていないが、こんな説明があると入力する側も理解しやすい。
		 //System.out.println("数値を２種類、半角スペースを開けて入力してください。");
		 //System.out.println("面積、周の長さが順番に表示されます。");

		 //br.readline(); = 入力された１行分を日本語変換して返してくれる。
		 String str = br.readLine();

		 //配列の型(intとかStringとか) [] 配列名 = 配列を用意
		 //今回はstrAryって配列にstrを入れてる。
		 //str.split = splitってのはString内に用意されてるメソッド
		 //文字列を分割するときに使用。今回は空白で区切ってって仕様なので
		 //split(" ")としてます。
		 String[] strAry = str.split(" ");

		 //おなじみの文字列から数値への変換。
		 //ただし今回は指定先が配列の何番って風になってる。
		 int x =  Integer.parseInt(strAry[0]);
		 int y =  Integer.parseInt(strAry[1]);

		 //いつも通りの出力。面積と周の長さを表示してる。
		 //出力も１つの空白で区切って１行と指示があるのでこんな具合に。
		 System.out.println(x*y + " " + 2*(x+y));
    }
}