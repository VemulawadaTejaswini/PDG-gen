

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		//キーがStringで中身がintのMapを作る（Map内では自動でソートされる）
		Map<String, Integer> count = new TreeMap<String, Integer>();
		for (int s=0; s<N; s++) {
			String S = br.readLine();
			if (count.containsKey(S)) { //Mapに既にキーがあるとき
				int now = count.get(S); //キーSに紐づく中身のintを取得
				count.replace(S, now + 1);
			}
			else {
				count.put(S, 1); //まだMapにキーが登録されていないなら、登録する
			}
		}
		
		int Max = 0;
		for (int val: count.values()) { 
			if (Max <= val) {
				Max = val;
			}
		}
		
		StringWriter s = new StringWriter();
	    for (Map.Entry<String, Integer> e :count.entrySet()){
	    	if (e.getValue() == Max) {
	    		s.append(e.getKey() + '\n');
	    	}
	    }
	    System.out.println(s.toString());
	}
	
}
