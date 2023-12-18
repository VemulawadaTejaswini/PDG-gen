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

	int N, K;
	long[] A;
	Deque<Long> deque;
	long MOD = 1000000007L;
	long result = 1;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		A = new long[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(A);
		deque = new ArrayDeque<>(N);
		for (int i = 0; i < N; ++i) {
			deque.addLast(A[i]);
		}
	}

	void calc() {
		// まず場合わけする
		if (deque.getFirst() >= 0) {
			// 大きい方からK個掛けるのがよい
			for (int i = 0; i < K; ++i) {
				result *= deque.pollLast();
				result %= MOD;
				if (result < 0) {
					result += MOD;
				}
			}
		} else if (deque.getLast() <= 0) {
			// 数が偶数か奇数かで分かれる
			if (K % 2 == 0) {
				// 絶対値が大きい方からK個掛けるのがよい
				for (int i = 0; i < K; ++i) {
					result *= deque.pollFirst();
					result %= MOD;
					if (result < 0) {
						result += MOD;
					}
				}
			} else {
				// 絶対値が小さい方からK個掛けるのがよい
				for (int i = 0; i < K; ++i) {
					result *= deque.pollLast();
					result %= MOD;
					if (result < 0) {
						result += MOD;
					}
				}
			}
		} else {
			int left = 0, right = N - 1;
			for (int i = 0; i < K / 2; i++) {
				long leftVal = A[left] * A[left + 1];
				long rightVal = A[right] * A[right - 1];
				if (leftVal <= rightVal) {
					result *= (rightVal % MOD);
					result %= MOD;
					if (result < 0) {
						result += MOD;
					}
					right -= 2;
				} else {
					result *= (leftVal % MOD);
					result %= MOD;
					if (result < 0) {
						result += MOD;
					}
					left += 2;
				}
			}
			if (K % 2 == 1) {
				result *= A[right];
				result %= MOD;
				if (result < 0) {
					result += MOD;
				}
			}
		}
		System.out.println(result);
	}

	void showResult() {
	}
}