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

	int K;
	Set<Integer> mods;
	int result = -1;

	Main(BufferedReader in) throws IOException {
		K = Integer.parseInt(in.readLine());
		mods = new HashSet<>();
	}

	void calc() {
		int val = 7;
		int count = 1;
		while (true) {
			if (val % K == 0) {
				break;
			}
			val %= K;

			if (mods.contains(val)) {
				count = -1;
				break;
			}
			mods.add(val);
			val *= 10;
			val += 7;
			++count;
		}
		result = count;
	}

	void showResult() {
		System.out.println(result);
	}
}
