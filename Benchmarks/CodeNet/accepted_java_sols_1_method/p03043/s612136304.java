import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		in.close();
		double result = 0.0;
		for (int i = 1; i <= N; ++i) {
			double initRatio = 1.0 / (double) N;
			int j = i;
			while (j < K) {
				j *= 2;
				initRatio *= 0.5;
			}
			result += initRatio;
		}
		System.out.println(result);
	}
}