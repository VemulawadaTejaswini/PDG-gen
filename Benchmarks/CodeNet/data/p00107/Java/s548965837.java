import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		outer:
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int[] e = new int[3];
			StringTokenizer st = new StringTokenizer(line);
			for (int i = 0; i < e.length; i++) {
				if ((e[i] = Integer.parseInt(st.nextToken())) == 0) {
					break outer;
				}
			}
			Arrays.sort(e);
			int diagonal = (int) (Math.pow(e[0], 2) + Math.pow(e[1], 2));

			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				int radius = Integer.parseInt(br.readLine());
				if (Math.pow(radius * 2, 2) > diagonal) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
			}
		}
	}
}