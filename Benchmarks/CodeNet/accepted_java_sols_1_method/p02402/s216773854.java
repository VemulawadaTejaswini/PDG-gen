import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int c = Integer.parseInt(br.readLine());
			String[] v = br.readLine().split(" ");

			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			long sum = 0;

			for (int i = 0; i < c; i++) {
				long n = Long.parseLong(v[i]);
				min = Math.min(n, min);
				max = Math.max(n, max);
				sum += n;
			}

			System.out.println(min + " " + max + " " + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}