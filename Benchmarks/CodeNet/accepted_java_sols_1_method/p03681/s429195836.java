import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(Math.abs(n-m) >= 2) {
			System.out.println("0");
			return;
		}
		long n$ = 1L;
		for(int i = 1; i <= n; i++) {
			n$ = n$ * i % 1000000007;
		}
		long m$ = 1L;
		for(int i = 1; i <= m; i++) {
			m$ = m$ * i % 1000000007;
		}
		long ans = n$ * m$ % 1000000007;
		System.out.println(n==m ? 2*ans%1000000007 : ans);
	}
}