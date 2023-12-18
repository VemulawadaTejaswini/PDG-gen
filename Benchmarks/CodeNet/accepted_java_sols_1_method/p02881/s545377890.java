import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		long N = Long.parseLong(in.readLine());

		long a = 1, b = N;
		for (long i = 2; i < Math.sqrt((double) N) + 1; ++i) {
			if (N % i == 0) {
				if ((a + b) > (i + N / i)) {
					a = i;
					b = N / i;
				}
			}
		}
		long result = a + b - 2;
		System.out.println(result);
	}
}
