

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 0;
		try {
			N = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		//キーがStringで中身がintのHashMapを作る
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for (int s=0; s<N; s++) {
			String S = "";
			try {
				S = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if (count.containsKey(S)) { //HashMapに既にキーがあるとき
				int now = count.get(S); //キーSに紐づく中身のintを取得
				count.replace(S, now + 1);
			}
			else {
				count.put(S, 1); //まだHashMapにキーが登録されていないなら、登録する
			}
		}
		
		int Max = 0;
		for (int val: count.values()) { 
			if (Max <= val) {
				Max = val;
			}
		}
		
		List<String> print = new ArrayList<String>();
		
		for (String s: count.keySet()) { 
			int now = count.get(s);
			if (now == Max) {
				print.add(s);
			}
		}
		Collections.sort(print);
		
		StringWriter s = new StringWriter();
	    for (int i = 0 ; i < print.size() ; i++){
	        String ans = print.get(i);
	        s.append(ans + '\n');
	    }
	    System.out.println(s.toString());
	}
	
}
