import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		long A = Long.parseLong(tokens[0]);
		long B = Long.parseLong(tokens[1]);
		long C = -1L;
		if (Math.abs(A - B) % 2 == 0) {
			if (A < B) {
				C = A + (B - A) / 2;
			} else {
				C = B + (A - B) / 2;
			}
		}
		if (C >= 0) {
			System.out.println(C);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}