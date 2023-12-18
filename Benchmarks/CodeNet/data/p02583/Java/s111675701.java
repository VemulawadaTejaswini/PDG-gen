import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	static class Tuple implements Comparable<Tuple> {
		long i, j, k;

		Tuple(long i, long j, long k) {
			this.i = i;
			this.j = j;
			this.k = k;
		}

		@Override
		public int compareTo(Tuple o) {
			if (this.i != o.i) {
				return Long.compare(this.i, o.i);
			} else if (this.j != o.j) {
				return Long.compare(this.j, o.j);
			} else {
				return Long.compare(this.k, o.k);
			}
		}
	}

	int N;
	long[] L;
	Map<Long, Integer> counts;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		L = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			L[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(L);
		counts = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!counts.containsKey(L[i])) {
				counts.put(L[i], 1);
			} else {
				counts.put(L[i], counts.get(L[i]) + 1);
			}
		}
	}

	void calc() {
		List<Long> keys = new ArrayList<>();
		keys.addAll(counts.keySet());
		Collections.sort(keys);
		long count = 0;
		for (int i = 0; i < keys.size(); ++i) {
			for (int j = i + 1; j < keys.size(); ++j) {
				for (int k = j + 1; k < keys.size(); ++k) {
					long I = keys.get(i);
					long J = keys.get(j);
					long K = keys.get(k);
					if (I + J > K) {
						count += counts.get(I) * counts.get(J) * counts.get(K);
					}
				}
			}
		}

		System.out.println(count);
	}

	void showResult() {
	}
}