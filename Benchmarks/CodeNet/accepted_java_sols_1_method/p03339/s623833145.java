import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char []s = sc.next().toCharArray();
		int []dp = new int [n+1];
		
		sc.close();
		
		for(int i = 0; i < n ; i++) {
			if(s[i] == 'W') {
				dp[i] += 0;	
				}
			if(s[i] == 'E') {
				dp[i] += 1;
			}
			dp[i+1] += dp[i];
		}
		int min = 300001;
		for(int i = 0; i < n ; i++) {
			int temp = 0;
			if(i > 0) {
				temp += i - dp[i-1];
			}
			temp += dp[n-1] -dp[i];
			
			min = Math.min(min,temp);
		}
		System.out.println(min);
	}

}
