import java.util.Scanner;

public class Main {
	public static final int maxN = 123456;
	public static void main(String args[]) {
		boolean[] isnotPrime = new boolean[maxN*2+1];
		for(int i=2;i*i<=maxN*2;i++) {
			if (isnotPrime[i]) {
				continue;
			}
			int n = i*2;
			while(n<maxN*2+1) {
				isnotPrime[n] = true;
				n+=i;
			}
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = 0;
			n = sc.nextInt();
			if (n==0) {
				break;
			}
			int ans = 0;
			for(int i=n+1;i<=2*n;i++) {
				if (!isnotPrime[i]) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}