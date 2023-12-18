import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			long n = stdIn.nextLong();
			long m = stdIn.nextLong();
			if(n == 0 && m == 0) break;
			Long[] c = new Long[11];
			for (int i = 0; i < 11; i++) {
				c[i] = 0L;
			}
			for (int i = 0; i < n; i++) {
				long d = stdIn.nextLong();
				int p = stdIn.nextInt();
				c[p] += d;
			}
			
			for (int i = 10; i >= 0; i--) {
				c[i] -= m;
				m = 0;
				if (c[i] < 0) {
					m += c[i] * -1L;
					c[i] = 0L;
				}
				if (m == 0)
					break;
			}
			Long ans = 0L;
			for (int i = 0; i <= 10; i++) {
				ans += c[i] * i;
			}
			System.out.println(ans);
		}
	}
}