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
		String S = tokens[0];
		String T = in.readLine();
		if (S.length() + 1 == T.length()) {
			if (S.equals(T.subSequence(0, S.length()))) {
				System.out.println("Yes");
			} else {
				System.out.println("No");

			}
		} else {
			System.out.println("No");
		}

	}

	void calc() {
	}

	void showResult() {
	}

}