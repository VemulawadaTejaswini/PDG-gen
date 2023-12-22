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
		int S = Integer.parseInt(tokens[0]);
		int W = Integer.parseInt(tokens[1]);
		if (W >= S) {
			System.out.println("unsafe");
		} else {
			System.out.println("safe");
		}
	}

	void calc() {
	}

	void showResult() {
	}

}
