import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	Tuple[] A;
	long count = 0;

	static class Tuple {
		String input;
		long seisuu;
		long shousuu;
		double A;

		Tuple(String input) {
			this.A = Double.parseDouble(input);
			this.input = input;
			String[] tokens = input.split("\\.");
			// System.out.println("tokens:" + tokens[0]);
			seisuu = Long.parseLong(tokens[0]);
			if (tokens.length >= 2) {
				StringBuilder strBuilder = new StringBuilder();
				strBuilder.append(tokens[1]);
				for (int i = 0; i < 9 - tokens[1].length(); ++i) {
					strBuilder.append("0");
				}
				shousuu = Long.parseLong(strBuilder.toString());
			} else {
				shousuu = 0L;
			}
		}

		boolean isOK(Tuple another) {
			long mod = 0L;
			long mod0 = seisuu * another.shousuu % 1000000000L;
			mod0 *= 1000000000L;
			long mod1 = another.seisuu * shousuu % 1000000000L;
			mod1 *= 1000000000L;
			long mod2 = shousuu * another.shousuu % 1000000000000000000L;
			mod = mod0 + mod1 + mod2;
			mod %= 1000000000000000000L;
			// System.out.println(this.input + " " + another.input + " " + mod);
			if (mod == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new Tuple[N];
		for (int i = 0; i < N; ++i) {
			A[i] = new Tuple(in.readLine());
		}
	}

	void calc() {
		List<Tuple> listA = new ArrayList<>();
		List<Tuple> listB = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			if (A[i].shousuu == 0L) {
				listA.add(A[i]);
			} else {
				listB.add(A[i]);
			}
		}
		count += listA.size() * (listA.size() - 1) / 2;
		for (int i = 0; i < listA.size(); ++i) {
			for (int j = 0; j < listB.size(); ++j) {
				if (listA.get(i).isOK(listB.get(j))) {
					++count;
				}
			}
		}
		for (int i = 0; i < listB.size(); ++i) {
			for (int j = i + 1; j < listB.size(); ++j) {
				if (listB.get(i).isOK(listB.get(j))) {
					++count;
				}
			}
		}
	}

	void showResult() {
		System.out.println(count);
	}
}