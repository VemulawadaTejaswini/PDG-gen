import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		try{
			String str = br.readLine();

			//空白で区切って配列を作成
			String[] strAry = str.split(" ");

			//配列strAryの要素を数値に変換してlistに追加
			for(int i=0; i<strAry.length; i++){
				list.add(Integer.valueOf(strAry[i]));
			}

			//小さいに並び替え
			Collections.sort(list);

			//出力
			System.out.print(list.get(0) + " " + list.get(1) + " " + list.get(2));
			System.out.println("");

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}