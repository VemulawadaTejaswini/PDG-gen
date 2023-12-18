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
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);

		if (A <= 5) {
			System.out.println(0);
		} else if (A <= 12) {
			System.out.println((B / 2));
		} else {
			System.out.println(B);
		}
	}
}
