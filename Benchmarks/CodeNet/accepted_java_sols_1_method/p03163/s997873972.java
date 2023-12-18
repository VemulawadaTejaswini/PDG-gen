
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cap = sc.nextInt();
		long dp[] = new long[cap+1];
		for(int item = 0; item < n; item++) {
			int w = sc.nextInt();
			long v = sc.nextLong();
			for(int i = cap; i != 0 ; i--) {
				if(i >= w)dp[i] = Math.max(dp[i],  v + dp[i-w]);
			}
//			System.out.println(Arrays.toString(dp));
		}
		System.out.println(dp[cap]);
	}
}
