/**
 * The Last One is the Best
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			int k = parseInt(line.substring(0, line.indexOf(' ')));
			int p = parseInt(line.substring(line.indexOf(' ') + 1));
			System.out.println((k %= p) != 0 ? k : p);
		}
	}
}