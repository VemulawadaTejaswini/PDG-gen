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

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		long A = Long.parseLong(tokens[0]);
		long V = Long.parseLong(tokens[1]);
		tokens = in.readLine().split(" ");
		long B = Long.parseLong(tokens[0]);
		long W = Long.parseLong(tokens[1]);
		long T = Long.parseLong(in.readLine());

		if (A < B) {
			long a = A + T * V;
			long b = B + T * W;
			if (a >= b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			long a = A - T * V;
			long b = B - T * W;
			if (a <= b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	void calc() {
	}

	void showResult() {
	}
}