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

	long N;
	List<Integer> list;

	Main(BufferedReader in) throws IOException {
		N = Long.parseLong(in.readLine()) - 1;
		list = new ArrayList<>();
	}

	void calc() {
		if (N == 0) {
			list.add(0);
			return;
		}
		while (N >= 0) {
			list.add((int) (N % 26));
			N /= 26;
			N -= 1;
		}
		Collections.reverse(list);

	}

	char conv(int i) {
		return (char) (i + 97);
	}

	void showResult() {
		char[] chars = new char[list.size()];
		for (int i = 0; i < list.size(); ++i) {
			chars[i] = conv(list.get(i));
		}
		for (int i = 0; i < list.size(); ++i) {
			System.out.print(chars[i]);
		}
		System.out.println("");
	}
}