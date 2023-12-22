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
		List<Integer> list = new ArrayList<>(3);
		for (int i = 0; i < 3; ++i) {
			list.add(Integer.parseInt(tokens[i]));
		}
		int K = Integer.parseInt(in.readLine());
		Collections.sort(list);
		int result = list.get(0) + list.get(1);
		result += Math.pow(2, K) * list.get(2);
		System.out.println(result);

	}

	void calc() {
	}

	void showResult() {
	}
}