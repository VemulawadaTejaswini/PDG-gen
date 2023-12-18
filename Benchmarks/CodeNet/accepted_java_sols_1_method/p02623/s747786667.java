import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		
		long[] sa = new long[n + 1];
		long[] sb = new long[m + 1];
		
		sa[0] = 0;
		for (int i = 1; i <= n; i++) {
			long a = sc.nextLong();
			sa[i] = sa[i - 1] + a;
		}
 		
		sb[0] = 0;
		for (int i = 1; i <= m; i++) {
			long b = sc.nextLong();
			sb[i] = sb[i - 1] + b;
		}
		
		int ans = 0;
		int j = m;
		for (int i = 0; i <= n; i++) {
			if (sa[i] > k) break;
			
			while (sa[i] + sb[j] > k)
				j--;
			
			ans = Math.max(ans, i + j);
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}

