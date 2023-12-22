import java.util.Scanner;

public class Main {
	static long mod = 1000000007;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long sum = 0;
			long tmpsum = 0;
			for (int i = 0; i < n; i++) {
				long tmp = sc.nextLong();
				long add = (tmp * tmpsum) % mod;
				sum = (sum + add) % mod;
				tmpsum = (tmpsum + tmp) % mod;
			}
			System.out.println(sum);
		}
	}
}