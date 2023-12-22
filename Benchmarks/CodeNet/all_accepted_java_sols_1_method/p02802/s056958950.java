import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// ACとWAの集計
		Set<Integer> ACset = new HashSet<>();
		Map<Integer, Integer> WAmap = new HashMap<>();
		for (int i = 0; i < M; i++) {
			int pi = sc.nextInt();
			String Si = sc.next();
			if (Si.equals("AC")) {
				ACset.add(pi);
			}
			else if (!ACset.contains(pi)){
				if (WAmap.containsKey(pi)) {
					int count = WAmap.get(pi) + 1;
					WAmap.put(pi, count);
				}
				else {
					WAmap.put(pi, 1);
				}
			}
		}
		
		// WAmapのうちACが一度でも出たものだけ集計
		int WAcount = 0;
		for (int key : WAmap.keySet()) {
			if (ACset.contains(key)) {
				WAcount += WAmap.get(key);
			}
		}
		// 結果の出力
		System.out.println(ACset.size() + " " + WAcount);

		sc.close();
	}
}
