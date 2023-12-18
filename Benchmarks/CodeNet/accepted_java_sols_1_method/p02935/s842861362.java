import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		int[] v = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			v[i] = Integer.parseInt(tokens[i]);
		}
		Arrays.sort(v);
		double result = 0.0;
		result += (double) v[0];
		result += (double) v[1];
		result /= 2.0;
		for (int i = 2; i < N; ++i) {
			result += (double) v[i];
			result /= 2.0;
		}
		System.out.println(result);
	}
}
