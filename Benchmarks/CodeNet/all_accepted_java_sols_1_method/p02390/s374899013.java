import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 //br.readline(); = 入力された１行分を日本語変換して返してくれる。
		 String str = br.readLine();

		 //おなじみの文字列から数値への変換。
		 int S =  Integer.parseInt(str);

		 //h = hour(○時間に直す)
		 int h = S/3600;

		 //m = minutes（○時間分を引いてから○分に直す）
		 int m = (S-h*3600)/60;

		 //s = second （○時間、○分を引く）
		 int s = S-h*3600-m*60;

		 /*いつも通りの出力。面積と周の長さを表示してる。
		 今回は/h、m、s を :（コロン）区切りで１行に出力してください。
		 数値が１桁の場合、0 を付けて２桁表示をする必要はなしとのことなのでこのような具合に。*/
		 System.out.println(h + ":" +m + ":" +s);
    }
}