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

	Main(BufferedReader in) throws IOException {
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] a = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = Integer.parseInt(tokens[i]);
		}
		int count = 0;
		for (int i = 0; i < N; ++i) {
			if ((i + 1) % 2 == 1 && a[i] % 2 == 1) {
				++count;
			}
		}
		System.out.println(count);

	}

	void calc() {
	}

	void showResult() {
	}
}
