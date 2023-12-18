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
		String[] tokens = in.readLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int C = Integer.parseInt(tokens[2]);
		int K = Integer.parseInt(in.readLine());

		int i = 0;
		for (; i < K; ++i) {
			if (B <= A) {
				B *= 2;
			} else {
				break;
			}
		}
		for (; i < K; ++i) {
			if (C <= B) {
				C *= 2;
			} else {
				break;
			}
		}
		if (A < B && B < C) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	void calc() {
	}

	void showResult() {
	}
}