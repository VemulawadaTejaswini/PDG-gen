import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{
	int [][] dp;
	int MAX = 1120;
	int K= 14;
	boolean [] isprime;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		
		isprime = new boolean[MAX + 1];
		eratos();
		
		dp = new int[K + 1][MAX + 1];
		dp();
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if((n|k) == 0) break;
			int ans = dp[k][n];
			//System.out.print("ANS = ");
			System.out.println(ans);
		}
		//debug
//		for(int i = 0; i < 30; i++){
//			System.out.println("i = " + i + "value= " + dp[1][i] + " "+ dp[2][i] + " dp3 = " + dp[3][i] + " dp4 = " + dp[4][i]);
//		}
	}

	private void dp() {
		//init
		for(int i = 1; i <= MAX; i++){
			dp[1][i] = isprime[i] ? 1 : 0;
		}
		
		for(int i = MAX; i >= 2; i--){
			if(! isprime[i]) continue;
			//for(int j = i; j <= MAX; j++){
			for(int j = MAX; j >= i; j--){
				for(int k = K - 1; k  >= 1; k--){
					if(k == 1 && j == i) continue;
					if(j + i > MAX) continue;
					dp[k+1][j + i] += dp[k][j];
//					if(j + i == 8 && k == 2){
//						System.out.println("debug=  " + i + " " + j  + " " + k + " " + dp[k][j]);
//					}
				}
			}
			
//			for(int j = i; j >= 2; j--){
//			for(int k = 1; k < K; k++){
//				if(k == 1 && j == i) continue;
//				if(j + i > MAX) continue;
//				dp[k + 1][j + i] += dp[k][j]; 
//				if(k == 2 && j == 5 && i == 5){
//					System.out.println("test");
//					System.out.println((j + i) + " " + dp[k][j]);
//				}
//			}
//		}
			// 2, 3 , 5
			//[0][5] => [1][5] = 1にする
			//[2][5] => [3][5 + 5] = 1にする
		}
	}

	private void eratos() {
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		for(int i = 2; i * i <= MAX; i++){
			if(isprime[i]){
				for(int j = i * 2; j <= MAX; j+= i){
					isprime[j] = false;
				}
			}
		}
		
	}

	public static void main(String [] args){
		new Main().doit();
	}
}