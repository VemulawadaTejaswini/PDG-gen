import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		try {
			//文字列の入力
			String str = br.readLine();

			//i番目の文字をArrayListに追加
			for(int i=0; i<str.length(); i++){
				list.add(str.substring(i,i+1));
			}

			//逆順に並び替える
			Collections.reverse(list);

			//出力
			for(String s : list){
				System.out.print(s);
			}
			System.out.println("");	//改行

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}