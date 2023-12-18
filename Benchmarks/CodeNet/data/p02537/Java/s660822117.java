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

	int N, K;
	int[] A;

	static class Tuple {
		int val, len;

		Tuple(int val, int len) {
			this.val = val;
			this.len = len;
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(in.readLine());
		}
	}

	void calc() {
		Queue<Tuple> que = new PriorityQueue<>(new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return -1 * Integer.compare(o1.len, o2.len);
			}
		});

		que.add(new Tuple(A[0], 1));
		List<Tuple> list = new ArrayList<>(N);
		for (int i = 1; i < N; ++i) {
			// 追加できるやつを探す
			Tuple tuple = null;
			while (!que.isEmpty()) {
				if (Math.abs(A[i] - que.peek().val) <= K) {
					tuple = que.poll();
					break;
				} else {
					list.add(que.poll());
				}
			}
			if (tuple == null) {
				// 見つけられなかった
				que.addAll(list);
				que.add(new Tuple(A[i], 1));
			} else {
				// 見つけられた
				que.add(new Tuple(A[i], tuple.len + 1));
				que.add(tuple);
				que.addAll(list);
			}
			list.clear();
		}
		System.out.println(que.peek().len);

	}

	void showResult() {
	}
}