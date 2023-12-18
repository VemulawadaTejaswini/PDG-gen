import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

// http://docs.oracle.com/javase/jp/6/api/java/util/PriorityQueue.html

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		int n = sc.nextInt();
		int q = sc.nextInt();
		PriorityQueue<Info> queue = new PriorityQueue<Info>(1,
				new ComparatorInfo());
		Map<Integer, Info> map = new HashMap<Integer, Info>();
		while (q-- > 0) {
			int a = sc.nextInt();
			int v = sc.nextInt();
			if (!map.containsKey(a)) {
				Info newData = new Info(a, v);
				queue.add(newData);
				map.put(a, newData);
			} else {
				Info now = map.get(a);
				queue.remove(now);
				now.cnt += v;
				queue.add(now);
			}
			System.out.println(queue.peek().id + " " + queue.peek().cnt);
		}
	}

	class Info {
		int id;
		int cnt;

		public Info(int id, int cnt) {
			super();
			this.id = id;
			this.cnt = cnt;
		}
	}

	class ComparatorInfo implements Comparator<Info> {
		@Override
		public int compare(Info arg0, Info arg1) {
			// TODO 自動生成されたメソッド・スタブ
			if (arg0.cnt == arg1.cnt) {
				return arg0.id - arg1.id;
			} else {
				return arg1.cnt - arg0.cnt;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}