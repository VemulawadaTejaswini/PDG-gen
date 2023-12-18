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
		String S = in.readLine();
		in.close();
		for (int i = 0; i < N; ++i) {
			if (i + 1 == K) {
				System.out.print(Character.toLowerCase(S.charAt(i)));
			} else {
				System.out.print(S.charAt(i));
			}
		}
		System.out.println("");
	}

}
