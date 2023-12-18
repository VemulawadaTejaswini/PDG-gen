import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj1172/input.txt"));
			// System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) break;
			int ans = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (isPrime(i))
					ans++;
			}
			System.out.println(ans);
		}
	}

	private boolean isPrime(int n) {
		for (int d = 2; d * d <= n; d++)
			if (n % d == 0)
				return false;
		return true;
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}