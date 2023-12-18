import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		//キーがStringで中身がintのHashMapを作る
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for (int s=0; s<N; s++) {
			String S = keyboard.next();
			if (count.containsKey(S)) { //HashMapに既にキーがあるとき
				int now = count.get(S); //キーSのに紐づく中身のintを取得
				count.replace(S, now + 1);
			}
			else {
				count.put(S, 1); //まだHashMapにキーが登録されていないなら、登録する
			}
		}
		
		int M = keyboard.nextInt();
		for (int t=0; t<M; t++) {
			String T = keyboard.next();
			if (count.containsKey(T)) {
				int now = count.get(T);
				count.replace(T, now - 1);
			}
		}
		
		int ans = 0;
		//拡張for分（左が確認する1個の名前、右が確認するものの集合）
		//HashMapでキーが登録されている部分のintの集合を、valとして1個ずつ順番に全部確認する
		//右にcount.keysと書くと、全てのキーの集合が取れるし、count.entryなら全てのキーと中身のセットの集合が取れる
		for (int val: count.values()) { 
			if (ans < val) {
				ans = val;
			}
		}
				
		System.out.println(ans);
		keyboard.close();
	}
	
}
