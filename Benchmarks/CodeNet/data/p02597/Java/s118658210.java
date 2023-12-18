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

	int N;
	String c;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		c = in.readLine();
	}

	void calc() {
		int rNum = 0;

		for (int i = 0; i < N; ++i) {
			if (c.charAt(i) == 'R') {
				++rNum;
			}
		}
		int wChangeNum = 0;
		for (int i = 0; i < rNum; ++i) {
			if (c.charAt(i) == 'W') {
				++wChangeNum;
			}
		}
		System.out.println(wChangeNum);
	}

	void showResult() {
	}
}
