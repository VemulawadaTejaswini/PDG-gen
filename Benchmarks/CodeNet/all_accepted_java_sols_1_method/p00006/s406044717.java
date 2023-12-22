import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//入力用オブジェクトの初期化
		StringBuilder str =  new StringBuilder(in.readLine());//文字列を取得してStringBuilder型の変数strに格納
		str.reverse();//文字列の逆順化
		System.out.println(str.toString());//逆順にした文字列の出力
	}
}