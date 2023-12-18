import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int T = Integer.parseInt(str[0]);
			int D = Integer.parseInt(str[1]);
			int L = Integer.parseInt(str[2]);
			if (T == 0 && D == 0 && L == 0)
				break;

			int x[] = new int[T];
			for (int i = 0; i < T; i++) {
				x[i] = Integer.parseInt(br.readLine());
			}

			int dCount = 0;
			int ans = 0;
			for (int i = 0; i < T - 1; i++) {
				if (x[i] >= L) {
					dCount = D - 1;
					ans++;
				} else if (dCount != 0) {
					dCount--;
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}

