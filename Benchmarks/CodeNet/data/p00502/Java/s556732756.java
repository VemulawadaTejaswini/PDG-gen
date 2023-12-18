import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int D = sc.nextInt();
		final int N = sc.nextInt();
		
		int[] ondo = new int[D];
		int[] hade = new int[N];
		
		boolean[][] ok = new boolean[D][N];
		int[][] dp = new int[D][N];
		
		for(int i = 0; i < D; i++){
			ondo[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++){
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			final int C = sc.nextInt();
			
			hade[i] = C;
			
			for(int j = 0; j < D; j++){
				if(ondo[j] >= A && ondo[j] <= B){
					ok[j][i] = true;
				}
			}
		}
		
		int max = 0;
		for(int i = 0; i < D - 1; i++){
			for(int j = 0; j < N; j++){
				if(!ok[i][j]){
					continue;
				}
				
				for(int k = 0; k < N; k++){
					if(!ok[i+1][k]){
						continue;
					}
					
					dp[i+1][k] = Math.max(dp[i+1][k], dp[i][j] + Math.abs(hade[j] - hade[k]));
					max = Math.max(dp[i+1][k], max);
				}
			}
		}
		
		System.out.println(max);
	}

}