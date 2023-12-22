import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++) {
			map.merge(sc.next(), 1, (v1, v2) -> (v1 + v2));
		}
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			String t = sc.next();
			if(map.containsKey(t)) {
				map.put(t, map.get(t) - 1);
			}
		}
		sc.close();
		int max = 0;
		for(String k : map.keySet()) {
			max = Math.max(max, map.get(k));
		}
		System.out.println(max);
	}
}