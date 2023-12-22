import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();

		int max = 0;
		for (int i = 0; i < N; i++) {
			String S = sc.next();

			if (map.containsKey(S)) {
				map.put(S, map.get(S) + 1);
			} else {
				map.put(S, 1);
			}
			max = Math.max(max, map.get(S));
		}
		List<String> list = new ArrayList<String>();
		for (Map.Entry<String, Integer> key : map.entrySet()) {
			if (key.getValue() == max) {
				list.add(key.getKey());
			}
		}
		Collections.sort(list);
		for (String S : list) {
			System.out.println(S);
		}
	}
}