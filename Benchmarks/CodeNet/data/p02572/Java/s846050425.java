import java.util.Scanner;
public class proj3 {
	
		public static void main(String[] args) {
			try(Scanner sc = new Scanner(System.in)){
				int n = sc.nextInt();
				long[] s = new long[n];
				long[] f = new long[n+1];
				long mod = 1000000007;
				f[0] = 0;
				for(int x = 0;x < n;x++) {
					s[x] = sc.nextInt();
					f[x + 1] = f[x] + s[x];
				}
				long d = 0;
				for(int x = 0;x < n;x++) {
					long sum = (f[n] - f[ x + 1]) % mod;
					d += s[x] * f[x]; 
					d = d % mod;
				}
				System.out.println(d);
			}
		}
}

