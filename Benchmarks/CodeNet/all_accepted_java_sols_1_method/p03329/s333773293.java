import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] dp = new int[100001];
		for(int i=1;i<=5;i++) {
			dp[i] = i;
		}
		for(int i=6;i<=8;i++) {
			dp[i] = i-5;
		}
		int sixPow = 6;
		int ninePow = 9;
		for(int i=9;i<=n;i++) {
			if(sixPow*6<=i) sixPow *= 6;
			if(ninePow*9<=i) ninePow *= 9;
			dp[i] = Math.min(dp[i-1]+1, Math.min(dp[i-sixPow]+1, dp[i-ninePow]+1));
		}
		
		System.out.println(dp[n]);
		in.close();
	}

}