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
	int[] memo;
	Map<Integer, Integer>[] primes;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		memo = new int[N + 1];
		Arrays.fill(memo, 0);
		memo[1] = 1;
		memo[2] = 2;
		memo[3] = 2;
		primes = new Map[N + 1];
		for (int i = 0; i <= N; ++i) {
			primes[i] = new HashMap<>();
		}
		primes[2].put(2, 1);
		primes[3].put(3, 1);
	}

	void sub(int val) {
		if (val <= 3) {
			return;
		}

		int divVal = -1;
		for (int i = 2; i <= Math.sqrt(val) + 1; ++i) {
			if (val % i == 0) {
				divVal = i;
				break;
			}
		}

		if (divVal < 0) {
			primes[val].put(val, 1);
			memo[val] = 2;
			return;
		} else {
			int remain = val / divVal;
			for (Integer key : primes[remain].keySet()) {
				primes[val].put(key, primes[remain].get(key));
			}
			for (Integer key : primes[divVal].keySet()) {
				if (primes[val].containsKey(key)) {
					primes[val].put(key, primes[val].get(key) + primes[divVal].get(key));
				} else {
					primes[val].put(key, primes[divVal].get(key));
				}
			}

			int count = 1;
			for (Integer key : primes[val].keySet()) {
				count *= primes[val].get(key) + 1;
			}
			memo[val] = count;
		}

	}

	void calc() {
		for (int i = 4; i <= N; ++i) {
			sub(i);
		}
		long result = 0L;
		for (int i = 1; i <= N; ++i) {
			result += (long) i * (long) memo[i];
		}
		System.out.println(result);
	}

	void showResult() {
	}
}