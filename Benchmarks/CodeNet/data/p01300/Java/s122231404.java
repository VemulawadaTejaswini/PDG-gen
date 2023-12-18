import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			String s = sc.next();
			if (s.equals("0")) break;
			int N = s.length();
			int[] v = new int[N];
			for (int i = 0; i < N; ++i) {
				v[i] = s.charAt(N - 1 - i) - '0';
				if (i % 2 == 1) v[i] *= -1;
			}
			int[] c = new int[11];
			c[0] = 1;
			long ans = 0;
			int sum = 0;
			for (int i = 0; i < N; ++i) {
				sum += v[i];
				if (sum > 10) sum -= 11;
				if (sum < 0) sum += 11;
				if (v[i] != 0) ans += c[sum];
				c[sum]++;
			}
			System.out.println(ans);
		}
	}

}