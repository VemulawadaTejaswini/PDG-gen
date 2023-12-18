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
		int L = Integer.parseInt(tokens[0]);
		int R = Integer.parseInt(tokens[1]);
		int d = Integer.parseInt(tokens[2]);
		int count = 0;
		for (int i = L; i <= R; ++i) {
			if (i % d == 0)
				++count;
		}
		System.out.println(count);
	}

	void calc() {
	}

	void showResult() {
	}
}
