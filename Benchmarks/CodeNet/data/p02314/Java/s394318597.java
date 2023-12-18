import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	int[] c = new int[10000];
	for (int i = 0; i < m; i++) {
		d[i]  = Integer.parseInt(sc.next());
	}
	int dp[] = new int[n+1];
	dp[0] = 1;
	
	for (int i = 1; i < n; i++) {
		dp[i] = dp[i-1]+1;
		for (int j = 0; j < m; j++) {
			if(c[j] == i){
				dp[i] == 1;
			}	
		}
	}
	
	System.out.println(dp[n]);
	}
}