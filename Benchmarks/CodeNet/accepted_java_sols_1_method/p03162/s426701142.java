import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int[][] score = new int[N][3];
		for(int i=0; i<N; i++) {
			for(int j=0; j<3; j++)
				score[i][j] = sc.nextInt();
		}
		long[][] dp = new long[N][3];
		dp[0][0] = score[0][0];
		dp[0][1] = score[0][1]; 
		dp[0][2] = score[0][2];
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<3; j++) {
				dp[i][j] = max(dp[i-1][ (j+1) % 3], dp[i-1][(j+2) % 3]) + score[i][j];
			}
		}
		long sum = max(max(dp[N-1][0], dp[N-1][1]),dp[N-1][2]);
		
		out.println(sum);		
	}
}