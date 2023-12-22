import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long K = Long.parseLong(tokens[1]);
		int Q = Integer.parseInt(tokens[2]);

		long[] scores = new long[N];
		Arrays.fill(scores, K - Q);

		for (int i = 0; i < Q; ++i) {
			int target = Integer.parseInt(in.readLine());
			scores[target - 1]++;
		}

		for (int i = 0; i < N; ++i) {
			if (scores[i] > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}