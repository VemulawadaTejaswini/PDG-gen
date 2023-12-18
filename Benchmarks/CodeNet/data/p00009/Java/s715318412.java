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

	List<Integer> primes = new ArrayList<Integer>();
	boolean[] isPrime = new boolean[MAX];

	private void start() {
		for(int i = 0; i < MAX; i++) isPrime[i] = false;
		for(int i = 2; i < MAX - 1; i++) {
			if(!isPrime[i]) primes.add(i);
			for(int j = i; j < MAX; j+=i) isPrime[j] = true;
		}
		while(has()) {
			pw.println(solve());
		}
	}

	private int solve() {
		int x = nint();
		while(true) {
			int idx = primes.indexOf(x--);
			if(idx > -1) {
				return primes.subList(0,idx+1).size();
			}
		}
	}
}