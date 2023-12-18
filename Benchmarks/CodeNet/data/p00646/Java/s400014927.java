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

			int ans = 1;
			int i = 0,cnt = 0;
			while (prime[i]<N ) {
				if(n%prime[i]==0){
					n/=prime[i];
					cnt++;
				}
				else{
					i++;
					ans*=(cnt+1);
					cnt=0;
					if(n==1) break;
				}
			}
			if(n!=1) ans*=2;
			out.println((ans+1)/2);
		}
		out.flush();
	}

	static final int N = 1000000;
	static boolean[] is_prime = new boolean[N+1];
	static int[] prime = new int[N];
	static void sieve(){
		int p = 0;
		for (int i = 0; i <=N ; i++) is_prime[i] = true;
		is_prime[0] = is_prime[1] = false;
		for (int i = 2; i <= N ; i++) {
			if(is_prime[i]){
				prime[p++] = i;
				for (int j = 2*i; j <= N ; j+=i) is_prime[j] = false;
			}
		}
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}