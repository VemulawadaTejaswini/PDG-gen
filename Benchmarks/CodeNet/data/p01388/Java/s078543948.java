/**
 * KUPC
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[] count = new int[4];
		for (char c : br.readLine().toCharArray()) {
			switch (c) {
				case 'K':
					count[0]++;
					break;
				case 'U':
					count[1]++;
					break;
				case 'P':
					count[2]++;
					break;
				case 'C':
					count[3]++;
					break;
			}
		}
		int min = 301;
		for (int i : count) {
			min = Math.min(min, i);
		}
		System.out.println(min);
	} //end main
}