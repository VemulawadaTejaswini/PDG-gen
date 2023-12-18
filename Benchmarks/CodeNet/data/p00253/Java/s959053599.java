import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		int n, h0, h1, h2, g = 0;
		int[] growth = new int[4];

		while (!(line = br.readLine()).equals("0")) {

			n = Integer.parseInt(line);

			line = br.readLine();
			st = new StringTokenizer(line);

			h1 = Integer.parseInt(st.nextToken());
			for (int i = 0; i < 4; i++) {
				h2 = Integer.parseInt(st.nextToken());
				growth[i] = h2 - h1;
				h1 = h2;
			}
			Arrays.sort(growth);
			for (int i = 0; i < 3; i++) {
				if (growth[i] == growth[i + 1])
					g = growth[i];
			}

			st = new StringTokenizer(line);
			h1 = Integer.parseInt(st.nextToken());
			for (int i = 0; i < n; i++) {
				h2 = Integer.parseInt(st.nextToken());
				if (h2 - h1 != g) {
					if (i == n - 1) {
						System.out.println(h2);
						break;
					}
					h0 = h1;
					h1 = h2;
					h2 = Integer.parseInt(st.nextToken());
					if (h2 - h1 != g) {
						System.out.println(h1);
						break;
					} else {
						System.out.println(h0);
						break;
					}
				} else {
					h1 = h2;
				}
			}
			//
		}
	}
}