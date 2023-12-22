import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);

		ArrayList<String> demands = new ArrayList<String>(m);

		for (int i = 0; i < m; i++) {
			String[] miline = br.readLine().split(" ");
			demands.add(String.format("%05d", Integer.parseInt(miline[0])) + "-"
					+ String.format("%05d", Integer.parseInt(miline[1])));
		}

		Collections.sort(demands);

		int ans = 0;
		int min = -1;
		int max = 999999999;

		for (int i = 0; i < m; i++) {
			String[] ab = demands.get(i).split("-");
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			if (a < max) {
				min = Math.max(a, min);
				max = Math.min(b, max);
			} else {
				ans++;
				min = a;
				max = b;
			}
		}

		ans++;

		System.out.println(ans);

	}

}
