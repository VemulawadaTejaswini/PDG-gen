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

	int N, M;
	long K;
	long[] A, B;
	int count = 0;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		K = Long.parseLong(tokens[2]);
		A = new long[N];
		B = new long[M];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < M; ++i) {
			B[i] = Long.parseLong(tokens[i]);
		}

	}

	void calc() {
		long time = 0;
		Queue<Long> queA = new ArrayDeque<>();
		for (int i = 0; i < N; ++i) {
			queA.add(A[i]);
		}
		Queue<Long> queB = new ArrayDeque<>();
		for (int i = 0; i < M; ++i) {
			queB.add(B[i]);
		}
		while (time < K) {
			if (!queA.isEmpty() && !queB.isEmpty()) {
				if (queA.peek() <= queB.peek()) {
					long t = queA.poll();
					time += t;
					++count;
				} else {
					long t = queB.poll();
					time += t;
					++count;
				}
			} else if (!queA.isEmpty()) {
				long t = queA.poll();
				time += t;
				++count;
			} else if (!queB.isEmpty()) {
				long t = queB.poll();
				time += t;
				++count;
			} else {
				break;
			}
		}
		if (time >= K) {
			--count;
		}
		System.out.println(count);

	}

	void showResult() {
	}
}