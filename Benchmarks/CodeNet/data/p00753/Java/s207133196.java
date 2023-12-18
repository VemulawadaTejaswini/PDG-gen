import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean[] prime = new boolean[246913];
	
	void run() {
		prime();
		while (true) {
			int n = sc.nextInt();
			if( n == 0) break;
			System.out.println(countPrime(n));
		}
	}
	
	void prime() {
		for(int i=2;i<=246912;i++) {
			if( !prime[i] ) {
				for(int j=i*2;j<246913;j+=i) 
					prime[j] = true;
			}
		}
	}
	
	int countPrime(int n) {
		int cnt = 0;
		for(int i=n+1;i<=2*n;i++) 
			if( !prime[i] ) cnt++;
		return cnt;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}