import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int q = Integer.parseInt(str[2]);

		int a[] = new int[n];
		Arrays.fill(a, k - q);

		for (int i = 0; i < q; i++) {
			int id = Integer.parseInt(br.readLine());
			a[id-1]++;
		}
		for (int j = 0; j < n; j++) {
			if (a[j] <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}