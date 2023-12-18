package main2;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		boolean[] dp = new boolean[a[n-1]+1];
		for(int i = 0; i < dp.length; i++) {
			dp[i] = true;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(dp[a[i]]) {
				if(i > 0 && a[i] == a[i-1])dp[a[i]] = false;
				for(int m = 2 * a[i]; m < dp.length; m += a[i]) {
					dp[m] = false;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(dp[a[i]])cnt++;
		}
		System.out.println(cnt);
	}
}