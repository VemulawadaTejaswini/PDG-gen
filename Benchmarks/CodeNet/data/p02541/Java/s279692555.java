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

	long N;

	Main(BufferedReader in) throws IOException {
		N = Long.parseLong(in.readLine());
	}

	long isOK(long val) {
		long x = (long) Math.sqrt((double) val);
		for (long i = x;; ++i) {
			if (i * (i + 1) > val) {
				return -1L;
			} else if (i * (i + 1) == val) {
				return i;
			}
		}
	}

	void calc() {
		long result = -1;
		for (long x = 1;; ++x) {
			long v = isOK(2L * N * x);
			if (v > 0) {
				result = v;
				break;
			}
		}
		System.out.println(result);
	}

	void showResult() {
	}
}