import java.util.*;
import java.util.stream.Collectors;
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
	int[] A;
	int Q;
	int[][] query;
	Map<Integer, Integer> counts;
	long sum = 0;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		Q = Integer.parseInt(in.readLine());
		query = new int[Q][2];
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			query[i][0] = Integer.parseInt(tokens[0]);
			query[i][1] = Integer.parseInt(tokens[1]);
		}
		counts = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!counts.containsKey(A[i])) {
				counts.put(A[i], 1);
			} else {
				counts.put(A[i], counts.get(A[i]) + 1);
			}
		}
		for (Integer key : counts.keySet()) {
			sum += (long) key * (long) counts.get(key);
		}
	}

	void calc() {
		// query評価
		for (int i = 0; i < Q; ++i) {
			int B = query[i][0];
			int C = query[i][1];
			if (counts.containsKey(B) && B != C) {
				// sumの更新
				sum += (long) (C - B) * (long) counts.get(B);
				int cNum = 0;
				if (counts.containsKey(C)) {
					cNum = counts.get(C);
				}
				counts.put(C, cNum + counts.get(B));
				counts.remove(B);
				System.out.println(sum);
			} else {
				System.out.println(sum);
			}
		}
	}

	void showResult() {
	}
}