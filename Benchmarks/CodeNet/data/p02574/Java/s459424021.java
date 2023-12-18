import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		var A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));

		if (isPairwise(A)) {
			System.out.println("pairwise coprime");
			return;
		}

		if (isSetwise(A)) {
			System.out.println("setwise coprime");
			return;
		}

		System.out.println("not coprime");
	}

	int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	boolean isPairwise(int[] A) {
		int[] count = new int[1000000 + 1];
		for (int l : A) {
			for (int i = 2; i * i <= l; i++) {
				if (l % i == 0) {
					if (count[i] > 0 || count[l / i] > 0) {
						return false;
					}
					count[i]++;
					if (i != l / i) count[l / i]++;
				}
			}
			count[l]++;
		}
		return true;
	}

	boolean isSetwise(int[] A){
		int gcd = A[0];
		for (int i = 1; i < A.length; i++) {
			gcd = gcd(gcd, A[i]);
		}
		return gcd == 1;
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		new Solver().solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}