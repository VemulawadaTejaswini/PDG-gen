import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		double result = (double) N;
		if (N % 2 == 0) {
			result = 0.5;
		} else {
			result = (double) (N / 2 + 1) / (double) N;
		}
		System.out.println(result);
	}
}
