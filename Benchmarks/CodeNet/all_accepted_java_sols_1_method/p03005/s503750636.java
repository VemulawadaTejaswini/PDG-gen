import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		in.close();
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		int result = 0;
		if (K == 1) {
			result = 0;
		} else {
			result = N - (K - 1) - 1;
		}
		System.out.println(result);
	}

}