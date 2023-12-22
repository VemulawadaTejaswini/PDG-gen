import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int A = Integer.parseInt(tokens[1]);
		int B = Integer.parseInt(tokens[2]);

		int resultA = N * A;
		if (resultA < B) {
			System.out.println(resultA);
		} else {
			System.out.println(B);
		}
		in.close();
	}
}