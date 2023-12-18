import java.util.*;

public class Main {
public static void main(String[] args) {

			Scanner keyboard = new Scanner(System.in);

			int N = keyboard.nextInt();
			//キーが棒の長さで中身が本数のHashMapを作る
			HashMap<Long, Integer> count = new HashMap<Long, Integer>();
			
			for (int s=0; s<N; s++) {
				long L = keyboard.nextLong();
				if (count.containsKey(L)) { //HashMapに既にキーがあるとき
					int now = count.get(L); //キーSのに紐づく中身のintを取得
					count.replace(L, now + 1);
				}
				else {
					count.put(L, 1); //まだHashMapにキーが登録されていないなら、登録する
				}
			}
			
			int ans = 0;
			//拡張for文（左が確認する1個の名前、右が確認するものの集合）
			//HashMapで登録されているキーの集合を、keyとして1個ずつ順番に全部確認する
			for (long key1: count.keySet()) {
				for (long key2: count.keySet()) {
					if(key1 < key2) {
					for (long key3: count.keySet()) {
						if(key2 < key3 && key1+key2 > key3){
							int a = count.get(key1);
							int b = count.get(key2);
							int c = count.get(key3);
							 ans += a*b*c;
							}
						}
					}
				}
			}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
