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
		int X = Integer.parseInt(tokens[0]);
		int Y = Integer.parseInt(tokens[1]);

		int temp = Y - (X * 2);
		if (temp % 2 != 0) {
			System.out.println("No");
		} else {
			temp /= 2;
			if (temp <= X) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
