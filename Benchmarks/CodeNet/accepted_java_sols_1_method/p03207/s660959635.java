import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];
		int max = 0;
		int maxI = 0;

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
			if (max < a[i]) {
				max = a[i];
				maxI = i;
			}
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (i == maxI) {
				ans += a[i] / 2;
			} else {
				ans += a[i];
			}
		}

		System.out.println(ans);
	}
}
