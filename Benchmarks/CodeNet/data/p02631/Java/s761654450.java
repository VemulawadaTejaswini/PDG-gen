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
	long[] a;
	long[] result;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		a = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			a[i] = Long.parseLong(tokens[i]);
		}
		result = new long[N];
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			long val = a[i];
			for (int diff = 1; diff < N / 2; ++diff) {
				int left = (i - diff + N) % N;
				int right = (i + diff) % N;
				val ^= a[left];
				val ^= a[right];
			}
			int target = (i + (N / 2)) % N;
			result[target] = val;
		}

	}

	void showResult() {
		System.out.print(result[0]);
		for (int i = 1; i < N; ++i) {
			System.out.print(" " + result[i]);
		}
		System.out.println("");
	}
}
