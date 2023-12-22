import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] d = new int[N];
		for (int i = 0; i < N; ++i) {
			d[i] = Integer.parseInt(tokens[i]);
		}
		int sum = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				sum += d[i] * d[j];
			}
		}
		System.out.println(sum);

	}
}
