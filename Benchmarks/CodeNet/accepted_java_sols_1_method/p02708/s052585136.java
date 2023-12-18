import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), k=sc.nextLong();
		sc.close();
		final long MOD = 1000000007;
		long ans=0;
		for(int i=0;k+i<=n+1;i++) {
			long temp = (n-k-i+1)*(k+i)%MOD+1;
			ans+=temp;
			ans%=MOD;
		}
		System.out.println(ans);
	}
}