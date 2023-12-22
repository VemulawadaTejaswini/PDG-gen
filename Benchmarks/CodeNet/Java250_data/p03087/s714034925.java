import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);

		String s[] = br.readLine().split("");

		int sum[] = new int[n];
		for (int i = 1; i < n; i++) {
			if (s[i].equals("C") && s[i - 1].equals("A")) {
				sum[i] = sum[i - 1] + 1;
			} else {
				sum[i] = sum[i - 1];
			}
		}

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");
			int l = Integer.parseInt(str[0]) - 1;
			int r = Integer.parseInt(str[1]) - 1;

			System.out.println(sum[r] - sum[l]);
		}
	}
}
