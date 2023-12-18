import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		
		int[][] phrase = new int[N][3];
		for(int i=0;i<N;i++){
			phrase[i][0] = Integer.parseInt(sc.next());
			phrase[i][1] = Integer.parseInt(sc.next());
			phrase[i][2] = Integer.parseInt(sc.next());
		}
		
		int M = Integer.parseInt(sc.next());
		int[] ans = new int[M];
		int[] W = new int[M];
		for(int i=0;i<M;i++){
			W[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		
		for(int i=0;i<M;i++){
			int w=W[i];
			int[][] dp = new int[N+1][w+1];
			
			for(int j=0; j<N;j++){
				for(int k=0; k<=w;k++){
					int tmp=dp[j][k];
					for(int l=phrase[j][0];l<=Math.min(phrase[j][0]*2, phrase[j][1]);l++){
						if(k-l>=0){
							tmp = Math.max(tmp,dp[j+1][k-l]+phrase[j][2]);
						}else{
							break;
						}
					}
					dp[j+1][k] = tmp;
				}
			}
			
			if(dp[N][w] == 0){
				System.out.println("-1");
				return;
			}else{
				ans[i] = dp[N][w];
			}
			
		}
		
		for(int ans_ : ans){
			System.out.println(ans_);
		}
		
		
	}
	
	
	
}
