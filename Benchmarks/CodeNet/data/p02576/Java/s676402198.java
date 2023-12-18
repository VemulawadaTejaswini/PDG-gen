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
		int N = Integer.parseInt(tokens[0]);
		int X = Integer.parseInt(tokens[1]);
		int T = Integer.parseInt(tokens[2]);
		int time = N % X == 0 ? N / X : N / X + 1;
		time *= T;
		System.out.println(time);
	}

	void calc() {
	}

	void showResult() {
	}
}
