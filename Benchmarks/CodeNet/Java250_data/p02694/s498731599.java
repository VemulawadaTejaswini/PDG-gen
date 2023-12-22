import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();
		long f = 100L;
		long ans = 0L;
		while (f < x) {
			long p = (long)(f * 0.01);
			f += p;
			ans++;
		}
		System.out.println(ans);
	}
}