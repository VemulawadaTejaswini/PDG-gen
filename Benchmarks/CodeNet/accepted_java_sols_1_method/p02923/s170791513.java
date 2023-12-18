
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		long[] H = new long[N];
		for (int i = 0; i < N; ++i) {
			H[i] = Long.parseLong(tokens[i]);
		}

		Deque<Long> deque = new ArrayDeque<>();
		int max = 1;
		deque.addFirst(H[0]);
		for (int i = 1; i < N; ++i) {
			if (deque.getLast() >= H[i]) {
				deque.addLast(H[i]);
			} else {
				deque.clear();
				deque.addLast(H[i]);
			}
			max = Math.max(max, deque.size());
		}
		System.out.println(max - 1);
	}

}
