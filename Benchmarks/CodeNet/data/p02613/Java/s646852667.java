
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
		int N = Integer.parseInt(in.readLine());
		int ac = 0, wa = 0, tle = 0, re = 0;
		for (int i = 0; i < N; ++i) {
			String str = in.readLine();
			if (str.equals("AC")) {
				++ac;
			} else if (str.equals("WA")) {
				++wa;
			} else if (str.equals("TLE")) {
				++tle;
			} else {
				++re;
			}
		}
		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + re);
		
	}

	void calc() {
	}

	void showResult() {
	}
}