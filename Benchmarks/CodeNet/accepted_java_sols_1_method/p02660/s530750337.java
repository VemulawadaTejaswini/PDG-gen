
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long input = n;

		// nを素因数分解する。結果はmapに、素因数と指数のペアで入れていくことにする。
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for (long i = 2; i * i <= input; i++) {
			long j = 0;
			while (true) {
				if (n % i == 0) {
					j++;
					map.put(i, j);
					n /= i;
				} else {
					break;
				}
			}
		}
		if (n != 1) {
			map.put(n, 1L); // 最後に残った数も忘れずに入れる
		}

		// 素因数分解の結果
		for (long key : map.keySet()) {
			// System.out.println(key + " " + map.get(key));
		}

		// 結果を求めて出力
		int result = 0;
		for (long key : map.keySet()) {
			long z = map.get(key);
			for (int j = 1; j < 10000; j++) {
				if (j <= z) {
					z -= j;
					result++;
				} else {
					break;
				}
			}
		}

		System.out.println(result);

	}
}