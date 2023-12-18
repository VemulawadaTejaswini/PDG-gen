import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n + 1];
		int b[] = new int[n];

		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n + 1; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(str[i]);
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			int temp = Math.min(a[i], b[i]);
			a[i] -= temp;
			b[i] -= temp;
			ans += temp;
			
			temp = Math.min(a[i + 1], b[i]);
			a[i + 1] -= temp;
			b[i] -= temp;
			ans += temp;
		}

		System.out.println(ans);
	}
}