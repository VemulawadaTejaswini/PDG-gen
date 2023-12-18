import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		long s[] = new long[1000100];
		long sum = 0;

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(str[i]);
			s[(int) a]++;
			sum += a;
		}

		long q = Long.parseLong(br.readLine());

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");
			long b = Long.parseLong(str[0]);
			long c = Long.parseLong(str[1]);

			long size = s[(int) b];
			s[(int) c] += s[(int) b];
			long sumDiff = c * size - b * size;
			sum += sumDiff;

			System.out.println(sum);
		}
	}
}