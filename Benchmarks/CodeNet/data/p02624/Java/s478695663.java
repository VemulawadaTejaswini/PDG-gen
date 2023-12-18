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

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		memo = new int[N + 1];
		Arrays.fill(memo, 0);
	}

	void calc() {
		for (int i = 1; i <= N; ++i) {
			for (int j = i; j <= N; j += i) {
				memo[j]++;
			}
		}
		long count = 0;
		for (int i = 1; i <= N; ++i) {
			count += (long) i * (long) memo[i];
		}
		System.out.println(count);
	}

	void showResult() {
	}
}