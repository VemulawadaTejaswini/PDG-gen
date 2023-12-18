import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Water Rate
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int A, B, C, D, P;
			A = parseInt(line);
			B = parseInt(br.readLine());
			C = parseInt(br.readLine());
			D = parseInt(br.readLine());
			P = parseInt(br.readLine());
			if (P <= C) System.out.println(Math.min(P * A, B));
			else System.out.println(Math.min(P * A, B + (P - C) * D));
		}
	}
}