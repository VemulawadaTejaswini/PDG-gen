import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}

		int []dp = new int [h+1];
		
		for(int i = 1 ;i <= h ; i++) {
			dp[i] = 1000000007;
		}
		dp[0] = 0;
		
		for(int i = 0 ;i <= h ;i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i+a[j] <= h) {
				dp[i+a[j]] = Math.min(dp[i+a[j]], dp[i] + b[j]);
			}
				else {
				dp[h] = Math.min(dp[h], dp[i] + b[j]);
				}
			}
		}
		
		System.out.println(dp[h]);
	}

}
