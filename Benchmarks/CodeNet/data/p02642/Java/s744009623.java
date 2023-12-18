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

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		Arrays.sort(A);
	}

	boolean check(int[] array, int index) {
		boolean isOK = true;
		for (int i = index - 1; i >= 0; --i) {
			if (array[index] % array[i] == 0) {
				isOK = false;
				break;
			}
		}
		return isOK;
	}

	void calc() {
		int count = 0;
		for (int i = N - 1; i >= 0; --i) {
			if (check(A, i)) {
				++count;
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}