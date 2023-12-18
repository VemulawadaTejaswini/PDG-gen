
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	static int N;
	static int S;
	static int[] A;
	static long[] t = new long[30];
	static long res = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		init30();
		read();
	}

	public static void init30() {
		t[0] = 1;
		for (int i = 1; i <= 29; i++) {
			t[i] = 1 << i;
		}
	}

	public static void add(Map<String, Integer> map, int K1, int K2, int K3,
			int V) {
		String key = K1+","+K2+","+K3;
		map.put(key,V);
	}

	public static Integer get(Map<String, Integer> map, int K1, int K2, int K3) {
		String key=K1+","+K2+","+K3;
		return map.get(key);

	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = br.readLine().split(" ");
		N = Integer.parseInt(word[0]);
		S = Integer.parseInt(word[1]);
		word = br.readLine().split(" ");
		A = new int[N];

		int[] sum = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.valueOf(word[i]);
		}
		Arrays.sort(A);
		for (int i = 0; i < N; i++) {
			if (i == 0) {
				sum[0] = A[0];
			} else {
				sum[i] = sum[i - 1] + A[i];
			}
		}
		Map<String,  Integer> map = new HashMap();
		for (int i = 0; i < N; i++) {
			add(map, i, 0, 0, 1);
		}
		if (S >= A[0]) {
			add(map, 0, 1, A[0], 1);
		}

//		System.out.println(map);
		
		HashMap<Integer, Integer> resmap = new HashMap<Integer, Integer>();
		for (int i = 1; i < N; i++) {
			for (int x = 1; x <= i + 1 && x < N; x++) {
				int tmp;
				if (x == i + 1) {
					tmp = 0;
				} else {
					tmp = sum[i - x];
				}
				for (int s = sum[x - 1]; s <= sum[i] - tmp && s <= S; s++) {
					Integer v = get(map, i - 1, x, s);
					Integer u = get(map, i - 1, x - 1, s - A[i]);
					Integer realValue = null;
					if (v != null && u != null) {
						add(map, i, x, s, v + u);
						realValue = v + u;
					} else if (v != null) {
						add(map, i, x, s, v);
						realValue = v;
					} else if (u != null) {
						add(map, i, x, s, u);
						realValue = u;
					} else {
					}

					if (i == N-1 && s == S && realValue != null) {
						resmap.put(x, realValue);
					}
				}
			}
		}

		long res = 0;
//		System.out.println(map);

		for (Entry<Integer, Integer> entry : resmap.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();

			res = res + (long) value * mypower(2, N - key) % 998244353;
			res = res % 998244353;
		}

		System.out.println(res);
		br.close();
	}

	public static long mypower(int base, int power) {
		int i = 0;
		long res = 1;
		while (i < power) {
			i = i + 29;

			if (i > power) {
				res = res * t[power - (i - 29)] % 998244353;
			} else {
				res = (res * t[29]) % 998244353;
			}

		}

		return res;
	}

}
