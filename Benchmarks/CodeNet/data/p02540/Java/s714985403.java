import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	int[] x, y;
	List<Tuple> list;
	Map<Integer, Integer> counts;

	static class Tuple {
		int id, x, y, gid;
		Set<Integer> conns;

		Tuple(int id, int x, int y) {
			this.gid = -1;
			this.id = id;
			this.x = x;
			this.y = y;
			this.conns = new HashSet<>();
		}

	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		x = new int[N];
		y = new int[N];
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			x[i] = Integer.parseInt(tokens[0]);
			y[i] = Integer.parseInt(tokens[1]);
		}
		list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			list.add(new Tuple(i, x[i], y[i]));
		}
		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Integer.compare(o1.x, o2.x);
			}
		});
	}

	void mark(int id, int gid, int parent) {
		list.get(id).gid = gid;
		for (Integer conn : list.get(id).conns) {
			if (conn != parent) {
				mark(conn, gid, id);
			}
		}
	}

	void update(Tuple tuple, Deque<Tuple> deque) {
		List<Tuple> list = new ArrayList<>();
		while (!deque.isEmpty() && deque.peek().y < tuple.y) {
			list.add(deque.poll());
		}

		// tupleとlistの各要素間にedgeを張る
		for (Tuple elem : list) {
			tuple.conns.add(elem.id);
			elem.conns.add(tuple.id);
		}

		Tuple next = tuple;
		for (Tuple elem : list) {
			if (elem.y < next.y) {
				next = elem;
			}
		}
		deque.addFirst(next);
	}

	void calc() {
		Deque<Tuple> deque = new ArrayDeque<>();
		deque.add(list.get(0));
		for (int i = 1; i < list.size(); ++i) {
			update(list.get(i), deque);
		}

		Collections.sort(list, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Integer.compare(o1.id, o2.id);
			}
		});

		// gidをmarkする
		int gid = 0;
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).gid < 0) {
				mark(i, gid, -1);
				++gid;
			}
		}

		counts = new HashMap<>();
		for (int i = 0; i < list.size(); ++i) {
			int g = list.get(i).gid;
			if (counts.containsKey(g)) {
				counts.put(g, counts.get(g) + 1);
			} else {
				counts.put(g, 1);
			}
		}

	}

	void showResult() {
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(counts.get(list.get(i).gid));
		}
	}
}