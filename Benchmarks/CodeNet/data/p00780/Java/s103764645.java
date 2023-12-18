import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		sieve();
		while(true){
			int n = si();
			if(n==0) break;
			int cnt = 0;
			for (int i = 0; prime[i] <= n/2; i++) {
				if(is_prime[n-prime[i]]) cnt++;
			}
			out.println(cnt);
		}
		out.flush();
	}

	static final int N = (int)Math.pow(2,15)+1;
	static boolean[] is_prime = new boolean[N + 1];
	static int[] prime = new int[N];

	static void sieve() {
		int p = 0;
		for (int i = 0; i <= N; i++)
			is_prime[i] = true;
		is_prime[0] = is_prime[1] = false;
		for (int i = 2; i <= N; i++) {
			if (is_prime[i]) {
				prime[p++] = i;
				for (int j = 2 * i; j <= N; j += i)
					is_prime[j] = false;
			}
		}
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}