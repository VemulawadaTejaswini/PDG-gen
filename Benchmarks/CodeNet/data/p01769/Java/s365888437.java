import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] x = new int[n];
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] dp = new int[l+1];
		dp[l] = 1;
		int jMax = l;
		int jTmp = 0;
		for(int i = n; i > 0; i--) {
			for(int j = 0; j <= jMax; j++) {
				if(dp[j] == 0) continue; 
				jTmp = j;
				if(a[i-1] == 0 && x[i-1] < j) {
					dp[x[i-1]] += dp[j];
					dp[x[i-1]] %= 1000000007;
				}
				else
				for(int k = 0; j > x[i-1] + a[i-1]*k; k++) {
					int tmp = x[i-1] + a[i-1] * k;
					dp[tmp] += dp[j];
					dp[tmp] %= 1000000007;
				}
				dp[j] = 0;
			}
			jMax = jTmp;
		}
		int sum = 0;
		for(int i = 0; i <= l; i++) {
			sum += dp[i];
			sum %= 1000000007;
		}
		
		System.out.println(sum);
		
		
		
		
	}
	
	
	
}