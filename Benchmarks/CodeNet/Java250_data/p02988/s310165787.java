import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int n = Integer.parseInt(in.readLine());
		int[] p = new int[n];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < n; ++i) {
			p[i] = Integer.parseInt(tokens[i]);
		}
		long count = 0;
		for (int i = 1; i + 1 < n; ++i) {
			if (check(p, i - 1, i, i + 1)) {
				++count;
			}
		}

		System.out.println(count);
		in.close();
	}

	static boolean check(int[] p, int i, int j, int k) {
		if (p[i] < p[j] && p[j] < p[k]) {
			return true;
		} else if (p[i] > p[j] && p[j] > p[k]) {
			return true;
		} else {
			return false;
		}
	}

}
