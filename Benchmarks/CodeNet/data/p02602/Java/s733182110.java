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

	int N, K;
	long[] A;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
	}

	void calc() {
		long sum = 0;
		for (int i = 0; i < K; ++i) {
			sum += A[i];
		}
		for (int i = K; i < N; ++i) {
			long next = sum;
			next -= A[i - (K)];
			next += A[i];
			if (next > sum) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			sum = next;
		}

	}

	void showResult() {
	}
}
