import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int d = Integer.parseInt(sa[2]);
		br.close();

		if (d == 0) {
			System.out.println(1.0 * (m - 1) / n);
		} else {
			System.out.println(2.0 * (n - d) * (m - 1) / n / n);
		}
	}
}
