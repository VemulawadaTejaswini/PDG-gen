import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Getting Started - Maximum Profit
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());

		int max = (int) -Math.pow(10, 9);
		int min = parseInt(br.readLine());

		for (int i = 0; i < n - 1; i++) {
			int r = parseInt(br.readLine());
			max = Math.max(max, r - min);
			min = Math.min(min, r);
		}
		System.out.println(max);
		
	} //end main
}