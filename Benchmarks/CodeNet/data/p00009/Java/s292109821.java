import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		boolean[] prime = sieve(999999);
		while(true){
			String s = r.readLine();
			if(s == null) break;
			int count = 0;
			int n = Integer.valueOf(s);
			for(int i = 2; i <= n; i++) {
				if(prime[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	private static boolean[] sieve(int n) {
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		int m = (int)Math.sqrt(n);
		for(int i = 2; i <= m; i++) {
			if(prime[i]) {
				for (int k = i*i; k <= n; k += i) {
					prime[k]=false;
				}
			}
		}
		return prime;
	}
}