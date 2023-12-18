import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int q = sc.nextInt();
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
		StringBuilder sb = new StringBuilder();
		while (q-- > 0) {
			int num = sc.nextInt();
			int get = sc.nextInt();
			if (!map.containsKey(num)) {
				Pair p = new Pair(num, get);
				map.put(num, p);
				pq.add(p);
			} else {
				Pair del = map.get(num);
				map.remove(num);
				pq.remove(del);
				del.cnt += get;
				map.put(num, del);
				pq.add(del);
			}
			Pair max = pq.peek();
			sb.append(max.num + " " + max.cnt + "\n");
		}
		System.out.println(sb);
	}

	class Pair implements Comparable<Pair> {
		int num;
		int cnt;

		public Pair(int num, int cnt) {
			super();
			this.num = num;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Pair arg0) {
			if (this.cnt == arg0.cnt) return this.num - arg0.num;
			return arg0.cnt - this.cnt;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}