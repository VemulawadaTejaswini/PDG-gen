
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
		int X = Integer.parseInt(in.readLine());
		int count = 1;
		int deg = X;
		while(deg != 0) {
			deg = (deg + X)%360;
			++count;
		}
		System.out.println(count);
	}

	void calc() {
	}

	void showResult() {
	}
}
