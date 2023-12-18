import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int q = sc.nextInt();
		C c = new C();
		// Pair[] ps = { new Pair(3, 2), new Pair(1, 41), new Pair(3, 4) };
		// Arrays.sort(ps, c);
		// System.out.println(Arrays.toString(ps));
		Queue<Pair> queue = new PriorityQueue<Pair>(1000 * 1000, c);
		Map<Integer, Pair> map = new HashMap<Integer, Pair>();
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int v = sc.nextInt();
			if (!map.containsKey(a)) {
				Pair p = new Pair(a, v);
				map.put(a, p);
				queue.add(p);
			} else {
				Pair p = map.get(a);
				queue.remove(p);
				p.b += v;
				queue.add(p);
			}
			// System.out.println(queue);
			Pair pp = queue.peek();
			System.out.println(pp.a + " " + pp.b);
		}

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();

	}

}

class C implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO 自動生成されたメソッド・スタブ
		if (o1.b == o2.b) {
			return o1.a - o2.a;
		}
		return o2.b - o1.b;
	}

}

class Pair {
	public int a;
	public int b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return a + " " + b;
	}
}