import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();

			char[][] result = new char[h][];
			for (int j = 0; j < result.length; j++) {
				String line = sc.next();
				result[j] = line.toCharArray();
			}

			Map<Character, Integer[]> map = new HashMap<Character, Integer[]>();
			Map<Character, Boolean> isUsed = new HashMap<Character, Boolean>();
			Deque<Character> deque = new ArrayDeque<Character>();
			char first = '.';
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result[j].length; k++) {
					if (result[j][k] != '.') {
						if (map.get(result[j][k]) == null) {
							Integer[] put = { j, k, j, k };
							map.put(result[j][k], put);
							isUsed.put(result[j][k], false);
							if (deque.isEmpty()) {
								deque.add(result[j][k]);
								first = result[j][k];
							}
						} else {
							Integer[] get = map.get(result[j][k]);
							map.get(result[j][k])[0] = Math.min(get[0], j);
							map.get(result[j][k])[1] = Math.min(get[1], k);
							map.get(result[j][k])[2] = Math.max(get[2], j);
							map.get(result[j][k])[3] = Math.max(get[3], k);
						}
					}
				}
			}

			boolean safe = true;
			check: while (!deque.isEmpty()) {
				char key = deque.poll();
				Integer[] get = map.get(key);
				if (isUsed.get(key)) {
					continue;
				}
				isUsed.put(key, true);

				for (int j = get[0]; j <= get[2]; j++) {
					for (int k = get[1]; k <= get[3]; k++) {
						if (result[j][k] == '.'
								|| (result[j][k] != key && result[j][k] == first)) {
							// 明らかに長方形でない時、もう見た文字の時
							System.out.println("SUSPICIOUS");
							safe = false;
							break check;
						} else if (result[j][k] != key) {
							// 別の文字がかぶっている時
							deque.add(result[j][k]);
						}
					}
				}

				if (deque.isEmpty()) {
					for (Character nextKey : map.keySet()) {
						if (!isUsed.get(nextKey)) {
							deque.add(nextKey);
							first = nextKey;
							break;
						}
					}
				}
			}

			if (safe) {
				System.out.println("SAFE");
			}
		}
		sc.close();
	}
}