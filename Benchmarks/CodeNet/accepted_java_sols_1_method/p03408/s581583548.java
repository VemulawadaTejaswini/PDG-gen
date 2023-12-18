import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> nMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			if (nMap.containsKey(s)) {
				Integer sAmount = nMap.get(s) + 1;
				nMap.put(s, sAmount);
			} else {
				nMap.put(s, 1);
			}
		}

		int M = sc.nextInt();
		Map<String, Integer> mMap = new HashMap<>();
		for (int i = 0; i < M; i++) {
			String t = sc.next();
			if (mMap.containsKey(t)) {
				Integer tAmount = mMap.get(t) - 1;
				mMap.put(t, tAmount);
			} else {
				mMap.put(t, -1);
			}
		}

		int maxAmount = 0;
		for (Entry<String, Integer> entry : nMap.entrySet()) {
			int currentAmount = entry.getValue();
			if (mMap.containsKey(entry.getKey())) {
				currentAmount += mMap.get(entry.getKey());
			}
			if (maxAmount < currentAmount) {
				maxAmount = currentAmount;
			}
		}

		// 出力
		System.out.println(maxAmount);

		sc.close();
	}
}
