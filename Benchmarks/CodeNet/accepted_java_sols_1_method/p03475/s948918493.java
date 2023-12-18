import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int c[] = new int[n - 1];
		int s[] = new int[n - 1];
		int f[] = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			String str[] = br.readLine().split(" ");

			c[i] = Integer.parseInt(str[0]);
			s[i] = Integer.parseInt(str[1]);
			f[i] = Integer.parseInt(str[2]);
		}

		for (int i = 0; i < n; i++) {
			int t = 0;
			for (int j = i; j < n - 1; j++) {
				int k = (int) Math.max(0.0, Math.ceil((double) (t - s[j]) / f[j]));
				t = s[j] + k * f[j];
				t += c[j];
			}
			System.out.println(t);
		}
	}

}
