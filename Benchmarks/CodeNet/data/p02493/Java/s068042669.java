import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			//要素数の読み込み
			int l = Integer.parseInt(br.readLine());
			//要素を配列として読み込む
			String[] str = br.readLine().split(" ");
			ArrayList<String> list = new ArrayList<String>(l);
			for(String s : str){
				list.add(s);
			}
			//逆順に並び替え
			Collections.reverse(list);
			//出力
			for(String s : list){
				System.out.print(s + " ");
			}
			System.out.println("");  //改行
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}