import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<N;i++) {
			ArrayList<Integer> edge_list = new ArrayList<Integer>();
			edge.add(edge_list);
		}
		for (int i=0;i<N-1;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			edge.get(a).add(b);
		}
		int[] p = new int[Q];
		int[] x = new int[Q];
		HashMap<Integer, Integer> query = new HashMap<Integer, Integer>();
		for (int i=0;i<Q;i++) {
			p[i] = Integer.parseInt(sc.next())-1;
			x[i] = Integer.parseInt(sc.next());
			if (!query.containsKey(p[i])) {
				query.put(p[i], x[i]);
			} else {
				query.put(p[i], query.get(p[i]) + x[i]);
			}
		}
		// System.out.println(query);
		long[] ans = new long[N];
		// Comparator<int[]> comparator = new Comparator<int[]>() {
  //   		@Override
  //   		public int compare(int[] o1, int[] o2) {
  //   			return Integer.compare(o1[0], o2[0]);
  //   		}
		// };

		ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
		int add_value_2 = 0;
		if (query.containsKey(0)) {
			add_value_2 += query.get(0);
		}
		int[] first = {0, add_value_2};
		queue.add(first);
		while (!queue.isEmpty()) {
			int[] rem = queue.poll();
			ans[rem[0]] = rem[1];
			for (int index : edge.get(rem[0])) {
			// System.out.println(index);

				int add_value = rem[1];
				if (query.containsKey(index)) {
					add_value += query.get(index);
				}
				int[] add_queue = {index, add_value};
				queue.add(add_queue);
			}
		}
		// System.out.println(Arrays.toString(ans));
		// System.out.println(edge);
		// System.out.println(N);
		for (int i=0;i<N;i++) {
			if (i==N-1) {
				System.out.print(ans[i]);
			} else {
				System.out.print(ans[i] + " ");
			}
		}
	}
}