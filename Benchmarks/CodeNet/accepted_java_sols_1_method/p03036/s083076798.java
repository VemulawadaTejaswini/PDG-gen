
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
		in.close();
		long r = Long.parseLong(tokens[0]);
		long D = Long.parseLong(tokens[1]);
		long x = Long.parseLong(tokens[2]);

		for (int i = 1; i <= 10; ++i) {
			long result = r * x - D;
			System.out.println(result);
			x = result;
		}
	}
}
