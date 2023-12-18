import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);

	void run() {
		while (sc2.hasNext()) {
			String input[] = sc2.nextLine().split(" ");
			HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				list.add(Integer.valueOf(input[i]));
			}
			hs.add(list);

			LinkedList<ArrayList<Integer>> queue = new LinkedList<ArrayList<Integer>>();
			queue.add(list);
			lable: while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					ArrayList<Integer> l = queue.poll();
					if (check(l)) {
						break lable;
					}
					int zeroIndex = 0;
					for (int j = 0; j < 8; j++) {
						if (l.get(j) == 0) {
							zeroIndex = j;
						}
					}
					if (zeroIndex - 1 >= 0 && zeroIndex != 4) {
						ArrayList<Integer> add = new ArrayList<Integer>(l);
						int t = l.get(zeroIndex);
						int r = l.get(zeroIndex - 1);
						add.set(zeroIndex, r);
						add.set(zeroIndex - 1, t);
						if (!hs.contains(add)) {
							hs.add(add);
							queue.add(add);
						}
					}
					if (zeroIndex + 1 < 8 && zeroIndex != 3) {
						ArrayList<Integer> add = new ArrayList<Integer>(l);
						int t = l.get(zeroIndex);
						int r = l.get(zeroIndex + 1);
						add.set(zeroIndex, r);
						add.set(zeroIndex + 1, t);
						if (!hs.contains(add)) {
							hs.add(add);
							queue.add(add);
						}
					}
					ArrayList<Integer> add = new ArrayList<Integer>(l);
					int t = l.get(zeroIndex);
					int r = l.get((zeroIndex + 4) % 8);
					add.set(zeroIndex, r);
					add.set((zeroIndex + 4) % 8, t);
					if (!hs.contains(add)) {
						hs.add(add);
						queue.add(add);
					}
				}
				cnt++;
			}
			System.out.println(cnt);
		}
	}

	boolean check(ArrayList<Integer> list) {
		boolean judge = true;
		for (int i = 0; i < 8; i++) {
			if (list.get(i) != i) {
				judge = false;
			}
		}
		return judge;
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