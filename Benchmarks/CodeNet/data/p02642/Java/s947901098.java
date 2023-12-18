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
	boolean[] flags;
	Map<Integer, Set<Integer>> primes;
	Map<Integer, Set<Integer>> invMap;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		Arrays.sort(A);
		flags = new boolean[N];
		Arrays.fill(flags, true);

		primes = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			primes.put(i, getPrimes(A[i]));
		}
		invMap = new HashMap<>();
		for (Integer key : primes.keySet()) {
			for (Integer prime : primes.get(key)) {
				if (!invMap.containsKey(prime)) {
					invMap.put(prime, new HashSet<>());
				}
				invMap.get(prime).add(key);
			}
		}

	}

	Set<Integer> getPrimes(int val) {
		Set<Integer> result = new HashSet<>();
		for (int i = 2; i < Math.sqrt(val) + 1; ++i) {
			if (val % i == 0) {
				result.add(i);
				result.addAll(getPrimes(val / i));
				break;
			}
		}
		if (result.isEmpty()) {
			result.add(val);
		}
		return result;
	}

	void check(int[] array, int target) {
		if (target + 1 < N && array[target] == array[target + 1]) {
			flags[target] = false;
		}

		Set<Integer> prime = primes.get(target);
		Set<Integer> targetIndexes = new HashSet<>();
		for (Integer p : prime) {
			targetIndexes.addAll(invMap.get(p));
		}
		for (Integer t : targetIndexes) {
			if (t <= target) {
				continue;
			}
			if (array[t] % array[target] == 0) {
				flags[t] = false;
			}
		}
	}

	void calc() {
		int count = 0;
		for (int i = 0; i < N; ++i) {
			if (flags[i]) {
				check(A, i);
			}
		}
		for (int i = 0; i < N; ++i) {
			if (flags[i]) {
				++count;
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}