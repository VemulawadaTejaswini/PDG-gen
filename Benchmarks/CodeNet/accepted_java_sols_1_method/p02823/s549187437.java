import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		long n = Long.parseLong(sa[0]);
		long a = Long.parseLong(sa[1]);
		long b = Long.parseLong(sa[2]);
		br.close();

		long c = b - a;
		if (c % 2 == 0) {
			System.out.println(c / 2);
		} else {
			long a1 = a - 1;
			long b1 = b - a1;
			long ans1 = a1 + b1 / 2;

			long b2 = n - b;
			long a2 = a + b2;
			long ans2 = b2 + (n - a2 + 1) / 2;
			System.out.println(Math.min(ans1, ans2));
		}
	}
}
