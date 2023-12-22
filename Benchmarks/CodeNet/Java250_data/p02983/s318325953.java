import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long mod = 2019;
	public void run() {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();

		long ans = 1001001001;
		for(long i=l+1; i<=Math.min(r, l+mod); i++) {
			for(long j=l; j<i; j++) {
				long tmp = i*j;
				tmp %= mod;
				ans = Math.min(ans, tmp);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
