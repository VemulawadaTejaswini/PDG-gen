import java.util.*;
import java.io.*;
public class Main {
	public static void main(String... args) {
		Main m = new Main();
		m.start();
		m.close();
	}

	private Scanner sc;
	private PrintWriter pw;

	public Main() {
		sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
	}

	private void close() { pw.flush(); pw.close(); }

	private boolean has() { return sc.hasNextInt(); }
	private int nint()    { return sc.nextInt();    }

	static int MAX = 1000000;

	boolean[] primes = new boolean[MAX];
	boolean[] isPrime = new boolean[MAX];

	private void start() {
		for(int i = 0; i < MAX; i++) {
			primes[i]  = false;
			isPrime[i] = true;
		}
		for(int i = 2; i < MAX - 1; i++) {
			if(isPrime[i]) primes[i] = true;
			for(int j = i; j < MAX; j+=i) isPrime[j] = false;
		}
		while(has()) {
			pw.println(solve());
		}
	}

	private int solve() {
		int N = nint();
		int ans = 0;
		for(int i = 0; i <= N; i++) {
			if(primes[i]) ans++;
		}
		return ans;
	}
}