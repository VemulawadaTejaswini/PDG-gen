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
		String S = in.readLine();
		char c = S.charAt(S.length() - 1);
		switch (c) {
		case '3':
			System.out.println("bon");
			break;
		case '0':
		case '1':
		case '6':
		case '8':
			System.out.println("pon");
			break;
		default:
			System.out.println("hon");

		}

	}

	void calc() {
	}

	void showResult() {
	}

}
