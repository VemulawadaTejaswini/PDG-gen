import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String T;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		T = in.readLine();
	}

	void calc() {
		char[] result = new char[T.length()];
		if (T.charAt(T.length() - 1) == '?') {
			result[T.length() - 1] = 'D';
		} else {
			result[T.length() - 1] = T.charAt(T.length() - 1);
		}
		char next = result[T.length() - 1];
		for (int i = T.length() - 2; i >= 0; --i) {
			if (T.charAt(i) == '?') {
				if (next == 'D') {
					result[i] = 'P';
				} else {
					result[i] = 'D';
				}
			} else {
				result[i] = T.charAt(i);
			}
			next = result[i];
		}
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < T.length(); ++i) {
			strBuilder.append(result[i]);
		}
		System.out.println(strBuilder.toString());
	}

	void showResult() {
	}
}