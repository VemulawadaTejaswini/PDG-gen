
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int[][] adj = { { 2 }, { 2, 5 }, { 0, 1, 3, 6 }, { 2, 7 }, { 5 },
				{ 1, 4, 6, 9 }, { 2, 5, 7, 10 }, { 3, 6, 8, 11 }, { 7 },
				{ 5, 10 }, { 6, 9, 11, 12 }, { 7, 10 }, { 10 } };
		String g = "0ABCDEFGHIJK0";
		Map<String, Integer> m = new HashMap<String, Integer>();
		Deque<String> deque = new ArrayDeque<String>();
		int step = 1;
		deque.offer(g);
		m.put(g, 0);
		while (!deque.isEmpty() && step < 20) {
			int size = deque.size();
			for (int k = 0; k < size; k++) {
				String s = deque.pop();
				char[] c = s.toCharArray();
				for (int i = 0; i < 13; i++) {
					if (c[i] == '0') {
						for (int j = 0; j < adj[i].length; j++) {
							char u = c[adj[i][j]];
							c[adj[i][j]] = '0';
							c[i] = u;
							String n = String.valueOf(c);
							if (!m.containsKey(n)) {
								m.put(n, step);
								deque.offer(n);
							}
							c[adj[i][j]] = u;
							c[i] = '0';
						}
					}
				}
			}
			step++;
		}
		while (true) {
			int p = scanner.nextInt();
			if (p == -1)
				break;
			char[] cc = new char[13];
			cc[0] = p == 0 ? '0' : (char) (p - 1 + 'A');
			for (int i = 1; i < 13; i++) {
				p = scanner.nextInt();
				cc[i] = p == 0 ? '0' : (char) (p - 1 + 'A');
			}
			String st = String.valueOf(cc);
			System.out.println(m.get(st) == null ? "NA" : m.get(st));

		}
	}
}