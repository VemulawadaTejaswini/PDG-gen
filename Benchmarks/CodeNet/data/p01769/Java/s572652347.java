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
		int[][] dp = new int[n+1][l+1];
		dp[n][l] = 1;
		for(int i = n; i > 0; i--) {
			for(int j = l; j > 0; j--) {
				if(dp[i][j] == 0) continue; 
				for(int k = 0; j > x[i-1] + a[i-1]*k; k++) {
					dp[i-1][x[i-1] + a[i-1] * k] += dp[i][j];
					dp[i-1][x[i-1] + a[i-1] * k] %= 1000000007;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i <= l; i++) {
			sum += dp[0][i];
			sum %= 1000000007;
		}
		
		System.out.println(sum);
		
		
		
		
	}
	
	
	
}