import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[160000];
		dp[0] = 0;
		for(int i=1;i<160000;++i) dp[i] = Integer.MAX_VALUE;
		int[] six = {6,36,216,1296,7776,46656};
		int[] nine = {9,81,729,6561,59049};
		
		for(int i=0;i<100000;++i){
			for(int ones=1;ones<=5;ones++) dp[i+ones] = Math.min(dp[i+ones], dp[i]+ones);
			for(int j=0;j<6;++j) dp[i+six[j]] = Math.min(dp[i+six[j]], dp[i]+1);
			for(int j=0;j<5;++j) dp[i+nine[j]] = Math.min(dp[i+nine[j]], dp[i]+1);
		}
		
		System.out.println(dp[N]);
		return;
	}
}