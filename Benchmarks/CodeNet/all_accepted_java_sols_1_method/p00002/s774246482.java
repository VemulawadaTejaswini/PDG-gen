import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		try{
			while((s=br.readLine())!=null){ //読み取る行がnullになるまで繰り返す
				//スペースの位置で2つに分ける
				String s1 = s.substring(0, s.indexOf(" "));
				String s2 = s.substring(s.indexOf(" ")+1);
				//分けた2つの文字列を整数に変換して足す
				int n = Integer.valueOf(s1) + Integer.valueOf(s2);
				//足した結果を文字列に変換して長さを測る
				int m = Integer.toString(n).length();

				System.out.println(m);

			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}