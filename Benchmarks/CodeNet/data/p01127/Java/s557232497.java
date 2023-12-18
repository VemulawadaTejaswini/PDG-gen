import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result[j].length; k++) {
					if (result[j][k] != '.') {
						if (map.get(result[j][k]) == null) {
							Integer[] put = { j, k, j, k };
							map.put(result[j][k], put);
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
			check: for (Entry<Character, Integer[]> e : map.entrySet()) {
				Integer[] get = e.getValue();
				Deque<Character> deque = new ArrayDeque<Character>();
				for (int j = get[0]; j <= get[2]; j++) {
					for (int k = get[1]; k <= get[3]; k++) {
						if (result[j][k] == '.') {
							// 明らかに長方形でない時
							System.out.println("SUSPICIOUS");
							safe = false;
							break check;
						} else if (result[j][k] != e.getKey()
								&& !deque.contains(result[j][k])) {
							// 別の文字がかぶっている時
							deque.add(result[j][k]);
						}
					}
				}

				while (!deque.isEmpty() && safe) {
					char poll = deque.poll();
					Integer[] cget = map.get(poll);
					for (int j = cget[0]; j <= cget[2]; j++) {
						for (int k = cget[1]; k <= cget[3]; k++) {
							if (result[j][k] == '.'
									|| result[j][k] == e.getKey()) {
								// 明らかに長方形でない時
								// 再び同じ文字が出てきた時
								System.out.println("SUSPICIOUS");
								safe = false;
								break check;
							} else if (result[j][k] != poll
									&& !deque.contains(result[j][k])) {
								// 別の文字がかぶっている時
								deque.add(result[j][k]);
							}
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