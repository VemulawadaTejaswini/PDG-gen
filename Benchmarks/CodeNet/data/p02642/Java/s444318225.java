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
	}

	void check(int[] array, int target) {
		if (target + 1 < N && array[target] == array[target + 1]) {
			flags[target] = false;
		}
		for (int i = target + 1; i < N; ++i) {
			if (array[i] % array[target] == 0) {
				flags[i] = false;
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