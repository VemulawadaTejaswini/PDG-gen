import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prime = new int[55556];
		boolean[] isprime = new boolean[55556];
		for (int i = 0; i < isprime.length; i++) {
			isprime[i] = true;
		}
		int p = 0;
		isprime[0] = false; isprime[1] = false;
		for (int i = 2; i < isprime.length; i++) {
			if(isprime[i]) {
				prime[p] = i;
				p++;
				for(int j = 2*i;j < isprime.length; j += i) {
					isprime[j] = false;
				}
			}
		}
		int[] ans = new int[n]; int q = 0;
		for (int i = 0; i < n; i++) {
			while(q<p) {
				if(prime[q]%5==1) {
					ans[i] = prime[q];
					q++;
					break;
				}
				q++;
			}
		}
		for (int i = 0; i < n; i++) System.out.printf("%d ",ans[i]);
		sc.close();
	}
}