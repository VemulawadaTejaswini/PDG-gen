import java.util.*;

public class Main {
	static long P = (int)1e9 +7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long dp[] = new long[n+1];
		dp[0] = 1;
		char s1[] = new char[n+1];
		char s2[] = new char[n+1];
		
		sc.next().getChars(0, n, s1, 1);
		sc.next().getChars(0, n, s2, 1);
		
		int i;
		if(s1[1] == s2[1]){
			dp[1] = 3;
			i=2;
		}
		else{
			dp[2] = 6;
			i=3;
		}
		
		for(;i<=n;i++){
			if(s1[i] == s2[i]){
				if(s1[i-1] == s2[i-1])
					dp[i] = dp[i-1] * 2 % P;
				else
					dp[i] = dp[i-1];
			}
			else{
				i++;
				if(s1[i-2] == s2[i-2]){
					dp[i] = dp[i-2] * 2 % P;
				}
				else{
					dp[i] = dp[i-2] * 3 % P;
				}
			}
		}
		System.out.println(dp[n]);
	}

}
