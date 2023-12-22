import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int t, n, s = 0;
			StringTokenizer st = new StringTokenizer(line);
			t = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());

			if (t > 1) {
				s = n * (6000 - t * 1000);
			} else {
				s = n * 6000;
			}
			System.out.println(s);
		}
	}
}