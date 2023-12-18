import java.util.*;

public class Main {

	static Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			// A[i] = sc.nextInt();
			int a = sc.nextInt();
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a) + 1);
			}
			sum += a; // 初期の合計を計算
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			// Biが含まれない場合はスキップ
			if (!map.containsKey(b)) {
				continue;
			}
			// BiをCiに置き換える
			int cnt = map.get(b);
			// Map操作
			map.remove(b);
			if (!map.containsKey(c)) {
				map.put(c, cnt);
			} else {
				map.put(c, map.get(c) + cnt);
			}
			// sumの更新
			sum += (c - b) * cnt;
			System.out.println(sum);
		}
		sc.close();
	}
}
