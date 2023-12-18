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
		int X = Integer.parseInt(in.readLine());
		if (X == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
