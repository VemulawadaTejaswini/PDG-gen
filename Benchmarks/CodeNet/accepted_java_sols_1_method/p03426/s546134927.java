import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int H = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());
		int r[] = new int[H*W+1];
		int c[] = new int[H*W+1];
		
		for(int i=1;i<=H;i++){
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=W;j++){
				int A = Integer.parseInt(st.nextToken());
				r[A] = i;
				c[A] = j;
			}
		}
		
		int dp[][] = new int[D+1][H*W/D+10];
		
		for(int i=1;i<=D && i+D <= H*W;i++){
			for(int j = 1;i+D*j<=H*W;j++){
				dp[i][j] = dp[i][j-1] + Math.abs(r[i+D*(j-1)]-r[i+D*j]) + Math.abs(c[i+D*(j-1)]-c[i+D*j]); 
			}
		}
		st = new StringTokenizer(br.readLine());
		int Q = Integer.parseInt(st.nextToken());
		
		while(Q-->0){
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
			
			int i = (L-1)%D + 1;
			
			sb.append(dp[i][(R-i)/D] - dp[i][(L-i)/D]+"\n");
		}
		System.out.print(sb);
	}
}