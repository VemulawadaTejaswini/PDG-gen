import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);

		// 正解した場合の時間
		long result = 1900 * M + 100 * (N - M);
		// 全部正解する確率
		long ratio = 2;
		for (int i = 2; i <= M; ++i) {
			ratio *= 2;
		}
		result *= ratio;
		System.out.println(result);
	}
}
