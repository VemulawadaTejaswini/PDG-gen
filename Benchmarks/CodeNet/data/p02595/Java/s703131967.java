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
		int N = Integer.parseInt(tokens[0]);
		int D = Integer.parseInt(tokens[1]);
		int count = 0;
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			long X = Integer.parseInt(tokens[0]);
			long Y = Integer.parseInt(tokens[1]);
			if ((double) D >= Math.sqrt((double) (X * X + Y * Y))) {
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
