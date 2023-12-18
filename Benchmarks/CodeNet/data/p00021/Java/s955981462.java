import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] s = line.split(" ");
				double[] ia = new double[s.length];
				for (int i = 0; i < s.length; i++) {
					ia[i] = Double.parseDouble(s[i]);
				}
				boolean isParallel = slope(ia[2], ia[3], ia[0], ia[1]) == slope(ia[6], ia[7], ia[4], ia[5]);
				System.out.println(isParallel ? "YES" : "NO");
			}
		}
	}
	public static double slope(double x1, double y1, double x2, double y2) {
		int dy = (int)y2 *10000 - (int)y1 *10000;
		if (dy == 0) {
			return 0;
		}
		int dx = (int)x2 *10000 - (int)x1 *10000;
		return dx / dy;
	}
}