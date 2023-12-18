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

			int W, H, x, y, r;
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());

			boolean res = true;
			if (x - r < 0) res &= false;
			if (x + r > W) res &= false;
			if (y - r < 0) res &= false;
			if (y + r > H) res &= false;

			System.out.println(res ? "Yes" : "No");
		}
	}
}