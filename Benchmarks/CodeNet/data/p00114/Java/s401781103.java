import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0114/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aojxxxx/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;sc.hasNext();) {
			long v[] = new long[3];
			for (int i = 0; i < 3; i++) {
				int a = sc.nextInt();
				int m = sc.nextInt();
				if (a == 0)
					return;
				v[i] = move(a, m);
			}
			long ans = lcm(v[0], lcm(v[1], v[2]));
			System.out.println(ans);
		}
	}
	
	long move(long a, long m) {
		long x = 1;
		int cnt = 0;
		do {
			cnt++;
			x = (x * a) % m;
		} while (x != 1);
		return cnt;
	}
	
	long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
	long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}