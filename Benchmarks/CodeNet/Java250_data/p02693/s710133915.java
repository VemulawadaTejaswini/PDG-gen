import java.util.*;
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
		int K = Integer.parseInt(tokens[0]);
		tokens = in.readLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		boolean enable = false;
		for (int i = A; i <= B; ++i) {
			if (i % K == 0) {
				enable = true;
				break;
			}
		}
		System.out.println((enable ? "OK" : "NG"));

	}

	void calc() {
	}

	void showResult() {
	}

}