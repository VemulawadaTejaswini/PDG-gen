import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long min = 999999999;

		for (int i = 1; i < n; i++) {
			String a = String.valueOf(i);
			String b = String.valueOf(n - i);
			int asum = 0;
			int bsum = 0;
			for (int j = 0; j < a.length(); j++) {
				asum += a.charAt(j) - 48;
			}
			for (int j = 0; j < b.length(); j++) {
				bsum += b.charAt(j) - 48;
			}
			min = Math.min(min, asum + bsum);
		}

		System.out.println(min);

	}

}
