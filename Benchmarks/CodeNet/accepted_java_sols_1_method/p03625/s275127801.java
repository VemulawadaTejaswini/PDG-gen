import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[]A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		for(int i = 0; i < N; i++) {
			map.merge(A[i], 1, (v1, v2) -> v1 + v2);
		}
		long h = 0;
		long w = 0;
		for(long k : map.keySet()) {
			if(map.get(k) >= 4) {
				h = Math.max(h, k);
				w = Math.max(w, k);
			}else if(map.get(k) >= 2) {
				if(h > w) {
					w = Math.max(w, k);
				}else {
					h = Math.max(h, k);
				}
			}
		}
		System.out.println(h * w);
	}
}