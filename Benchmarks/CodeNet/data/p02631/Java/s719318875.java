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
		{
			// まず最初の要素を求める
			long val = a[0];
			for (int diff = 1; diff < N / 2; ++diff) {
				int left = (0 - diff + N) % N;
				int right = (0 + diff) % N;
				val ^= a[left];
				val ^= a[right];
			}
			int target = (0 + (N / 2)) % N;
			result[target] = val;
		}
		{
			// まず最初の要素を求める
			long val = a[1];
			for (int diff = 1; diff < N / 2; ++diff) {
				int left = (1 - diff + N) % N;
				int right = (1 + diff) % N;
				val ^= a[left];
				val ^= a[right];
			}
			int target = (1 + (N / 2)) % N;
			result[target] = val;
		}

		// result[N/2]が求まったので，そこを足がかりに求める
		for (int i = N / 2 + 1; i < N / 2 + N; ++i) {
			int index = i % N;
			int left = (index - 1 + N) % N; // これは
			int right = (index + 1) % N;
			long val = a[left] ^ a[right];
			val ^= result[left];
			result[right] = val;
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