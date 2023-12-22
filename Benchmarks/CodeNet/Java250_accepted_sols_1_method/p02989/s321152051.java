import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<Integer> scores = new ArrayList<>(N);
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			scores.add(Integer.parseInt(tokens[i]));
		}
		Collections.sort(scores);
		int little = scores.get(scores.size() / 2 - 1);
		int large = scores.get(scores.size() / 2);
		int result = large - little;
		System.out.println(result);

		in.close();
	}

}
