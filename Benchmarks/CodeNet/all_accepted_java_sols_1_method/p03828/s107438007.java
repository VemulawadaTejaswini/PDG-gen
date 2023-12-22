import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final long Mod = 1000_000_007;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc.close();
		int[] a = new int[n+1];
		Arrays.fill(a, 1);
		long res = 1;

		for(int i = 2;i<=n;i++) {
			int t=i;
			for(int j=2;j<=t;j++) {
				while(t%j==0) {
					t/=j;
					a[j]++;
				}
			}
		}
		for(int i=1;i<=n;i++) {
			res = res*a[i];
			for(;res>Mod;)res-=Mod;
		}
		System.out.println(res);
	}
}