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
		Deque<Long> remainA = new ArrayDeque<>();
		for (int i = 0; i < N; ++i) {
			remainA.add(A[i]);
		}
		Deque<Long> remainB = new ArrayDeque<>();
		for (int i = 0; i < M; ++i) {
			remainB.add(B[i]);
		}
		Deque<Long> readA = new ArrayDeque<>();
		Deque<Long> readB = new ArrayDeque<>();

		// まずAを読めるだけ読む
		while (!remainA.isEmpty()) {
			if (time + remainA.peekFirst() <= K) {
				long t = remainA.pollFirst();
				readA.add(t);
				time += t;
			} else {
				break;
			}
		}
		// 余裕があればBも読めるだけ読む
		while (!remainB.isEmpty()) {
			if (time + remainB.peekFirst() <= K) {
				long t = remainB.pollFirst();
				readB.add(t);
				time += t;
			} else {
				break;
			}
		}

		int maxCount = readA.size() + readB.size();

		while (!readA.isEmpty()) {
			// Aから読むのを1つ減らす
			long t = readA.pollLast();
			time -= t;
			while (!remainB.isEmpty()) {
				if (time + remainB.peekFirst() <= K) {
					long t2 = remainB.pollFirst();
					readB.add(t2);
					time += t2;
				} else {
					break;
				}
			}
			maxCount = Math.max(maxCount, readA.size() + readB.size());
			if (remainB.isEmpty()) {
				break;
			}
		}
		System.out.println(maxCount);

	}

	void showResult() {
	}
}
