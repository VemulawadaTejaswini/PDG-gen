/*
 * Hit and Blow
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int hit = 0, blow = 0;

			int[] pos = new int[10];
			char[] r = line.substring(0, 4).toCharArray();
			char[] a = line.substring(5).toCharArray();

			for (int i = 0; i < r.length; i++) {
				pos[r[i] - '0'] = i + 1;
			}
			for (int i = 0; i < a.length; i++) {
				if (pos[a[i] - '0'] > 0) {
					if (pos[a[i] - '0'] == i + 1) {
						hit++;
					} else {
						blow++;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}

	}
}