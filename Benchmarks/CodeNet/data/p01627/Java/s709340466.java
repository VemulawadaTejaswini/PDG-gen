import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		int N = sc.nextInt();
		int T = sc.nextInt();
		String input[][] = new String[N][4];
		for (int i = 0; i < N; i++) {
			input[i] = sc2.nextLine().split(" ");
		}
		int cnt = 0;
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < N - 1; i++) {
			String[] stop_time = input[i][2].split(":");
			String[] start_time = input[i + 1][0].split(":");

			int aTime = Integer.valueOf(stop_time[0]) * 60
					+ Integer.valueOf(stop_time[1]);
			int bTime = Integer.valueOf(start_time[0]) * 60
					+ Integer.valueOf(start_time[1]);
			if (bTime - aTime >= T) {
				cnt++;
				output.add(input[i][3] + " " + (bTime - aTime));
			}
		}
		System.out.println(cnt);
		for (String p : output) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}