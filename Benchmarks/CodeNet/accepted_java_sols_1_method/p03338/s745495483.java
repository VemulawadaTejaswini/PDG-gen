import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] IN =br.readLine().split("") ; 
		
		int MAX = 0;
		
		for(int i=0; i<N; i++) {
			
			HashMap<String,Integer> count = new HashMap<String,Integer>();
			//文字列をカットした左半分について
			for(int j=0; j<i+1; j++) {
				if (!count.containsKey(IN[j])) {
					count.put(IN[j], 1); //まだHashMapにキーが登録されていないなら、登録する
				}
			}
			
			//文字列をカットした右半分について
			for(int j=i+1; j<N; j++) {
				if (count.containsKey(IN[j])) { //HashMapに既にキーがあるとき
					int now = count.get(IN[j]); //キーSに紐づく中身のintを取得
					count.replace(IN[j], now + 1);
				}
			}
			
			int c = 0;
			for(int key1:count.values()) {
				if(key1 > 1) {
					c++;
				}
			}
			if(MAX<c) {
				MAX = c;
			}
		}
		
		System.out.println(MAX);	
	}
}