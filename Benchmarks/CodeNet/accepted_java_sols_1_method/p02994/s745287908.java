import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int L = Integer.parseInt(tokens[1]);

		long taste = 0;
		int lMin = L;
		int lMax = L + N - 1;
		int l = L;
		for (int i = 0; i < N; ++i) {
			taste += l;
			l++;
		}
		if (lMin < 0 && lMax < 0) {
			taste -= lMax;
		} else if (lMin <= 0 && lMax >= 0) {

		} else {
			taste -= lMin;
		}
		System.out.println(taste);
		in.close();
	}

}
