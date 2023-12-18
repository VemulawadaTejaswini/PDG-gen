import java.util.*;
import java.io.*;
 
public class Main{
	public static long decrease(int[] c, int D, int[] last){
		long sum = 0;
		for(int j = 0; j < 26; j++){
			sum += c[j]*((D+1)-last[j]);
		}
		return sum;
	}
    
	public static void main(String[] $){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int[] c = new int[26];
		for(int i = 0; i < 26; i++){
			c[i] = sc.nextInt();
		}
		int[][] s = new int[D][26];
		for(int i = 0; i < D; i++){
			for(int j = 0; j < 26; j++){
				s[i][j] = sc.nextInt();
			}
		}
		int[][][] dplast = new int[D+1][27][26];
		long satisfact = 0;
		long[][] dp = new long[D+1][27];
		int[][] dpsentaku = new int[D+1][27];

		for(int i = 0; i < D; i++){
			for(int j = 0; j < 26; j++){
				if(dp[i][j+1]-decrease(c, i, dplast[i+1][j+1])+s[i][j] < dp[i+1][j]){
					dp[i+1][j+1] = dp[i+1][j];
					dpsentaku[i+1][j+1] = dpsentaku[i+1][j];
					dplast[i+1][j+1] = dplast[i+1][j]; 
				}else{
					dp[i+1][j+1] = decrease(c, i, dplast[i+1][j+1])+s[i][j];
					dpsentaku[i+1][j+1] = j+1;
					dplast[i+1][j+1][j] = i+1;
				}
			}
		}
		for(int i = 0; i < D; i++){
			System.out.println(dpsentaku[i+1][26]);
		}
		
	}
} 