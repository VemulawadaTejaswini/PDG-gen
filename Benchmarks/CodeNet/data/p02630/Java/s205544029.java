import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long s[] = new long[1000000];
		long sum = 0;

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			s[a]++;
			sum += a;
		}

		int q = Integer.parseInt(br.readLine());

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");
			int b = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);

			long size = s[b];
			s[c] += s[b];
			long sumDiff = c * size - b * size;
			sum += sumDiff;

			System.out.println(sum);
		}
	}
}