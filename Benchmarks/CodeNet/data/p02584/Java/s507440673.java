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

	long X, K, D;
	long result = 0;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		X = Long.parseLong(tokens[0]);
		K = Long.parseLong(tokens[1]);
		D = Long.parseLong(tokens[2]);
	}

	void calc() {
		long times = Math.abs(X) / D;
		if (times >= K) {
			if (X >= 0) {
				result = X - D * K;
			} else {
				result = X + D * K;
			}
		} else {
			if (X >= 0) {
				X = X - D * times;
			} else {
				X = X + D * times;
			}
			K -= times;
			if (K % 2 != 0) {
				if (X >= 0) {
					result = Math.abs(X - D);
				} else {
					result = Math.abs(X + D);
				}
			} else {
				result = X;
			}
		}
		result = Math.abs(result);
		System.out.println(result);
	}

	void showResult() {
	}
}