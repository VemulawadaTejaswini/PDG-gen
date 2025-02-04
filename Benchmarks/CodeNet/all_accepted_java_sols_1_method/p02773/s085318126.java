import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

// https://atcoder.jp/contests/abc155/tasks/abc155_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

/////////////////////////////////////
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			if (map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			} else {
				map.put(str, 1);
			}
		}
///////////////////////////////////////
		sc.close();

///////////////////////////////////////
		Optional<Entry<String, Integer>> maxEntry = map.entrySet()
				.stream().max((Entry<String, Integer> e1, Entry<String, Integer> e2) -> e1.getValue().compareTo(e2.getValue())
		        );
		int maxKey = maxEntry.get().getValue();
///////////////////////////////////////
		ArrayList<String> stateList = new ArrayList<String>();
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			if(entry.getValue()==maxKey) {
				stateList.add(entry.getKey());
			}
		}
		Collections.sort(stateList);
		for(int i=0;i<stateList.size();i++){
			System.out.println(stateList.get(i));
		}
	}
}
