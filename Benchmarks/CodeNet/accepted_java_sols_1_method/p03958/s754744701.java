import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int k = Integer.parseInt(str[0]);
		int t = Integer.parseInt(str[1]);

		int a[] = new int[t];

		str = br.readLine().split(" ");

		int max = 0;
		int maxI = 0;

		for (int i = 0; i < t; i++) {
			a[i] = Integer.parseInt(str[i]);
			if (a[i] > max) {
				max = a[i];
				maxI = i;
			}
		}

		int sum = 0;
		for (int i = 0; i < t; i++) {
			if (i == maxI) {
				continue;
			}
			sum += a[i];
		}
		if (sum > max) {
			System.out.println("0");
		} else {
			int n = max - sum;
			System.out.println(n - 1);
		}
	}
}
