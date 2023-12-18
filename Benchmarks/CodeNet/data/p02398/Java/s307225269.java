import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);

			int a, b, c;
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			boolean[] div = new boolean[c + 1];
			boolean[] find = new boolean[div.length + 1];
			int count = 0;

			for (int i = 2; i < c / 2; i++) {
				for (int j = 2; j < div.length / i; j++) {
					div[i * j] = true;
				}
			}

			//
			for (int i = 1; i <= a; i++) {
				if (!div[i] && c % i == 0) {
					if (!find[i]) {
						find[i] = true;
						count++;
					}
				}
			}
			for (int i = 1; i <= b; i++) {
				if (!div[i] && c % i == 0) {
					if (!find[i]) {
						find[i] = true;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}