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
		
		long[] H = new long[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		
		Map<Integer, Set<Integer>> routes = new HashMap<>();
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (routes.get(A) == null) {
				Set<Integer> route = new HashSet<>();
				route.add(B);
				routes.put(A, route);
			}
			else {
				routes.get(A).add(B);
			}
			
			if (routes.get(B) == null) {
				Set<Integer> route = new HashSet<>();
				route.add(A);
				routes.put(B, route);
			}
			else {
				routes.get(B).add(A);
			}
		}

		// 結果の出力
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (routes.get(i) == null) {
				count++;
			}
			else {
				boolean goodObservatory = true;
				for (int j : routes.get(i)) {
					if (H[i-1] <= H[j-1]) {
						goodObservatory = false;
						break;
					}
				}
				if (goodObservatory) {
					count++;
				}
			}
		}
		
		System.out.println(count);

		sc.close();
	}
}
