import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	//2327 start
	int [] map = {-1, 0,1,2,0,-1,2,0,1,2};
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.next();
			if(s.equals("#")) break;
			int len = s.length();
			int [][][][] dp = new int[len][2][3][3];
			int firststep = map[s.charAt(0) - '0'];
			for(int i = 0; i < len; i++){
				for(int j = 0; j < 2; j++){
					for(int k = 0; k < 3; k++){
						for(int l = 0; l < 3; l++){
							dp[i][j][k][l] = INF;
						}
					}
				}
			}
			dp[0][0][firststep][2] = 0;
			dp[0][1][0][firststep] = 0;
			
			for(int i = 0; i < len-1; i++){
				for(int j = 0; j < 2; j++){
					for(int left = 0; left < 3; left++){
						for(int right = 0; right < 3; right++){
							if(dp[i][j][left][right] == INF) continue;
							dp[i+1][j][left][right] = 
									Math.min(dp[i+1][j][left][right], dp[i][j][left][right] + 1);
							
							int lefts = left;
							int rights = right;
							if(j == 0){
								rights = map[s.charAt(i+1) - '0'];
							}
							else{
								lefts = map[s.charAt(i+1) - '0'];
							}
							if(rights < lefts) continue;
							dp[i+1][(j + 1) % 2][lefts][rights] = 
									Math.min(dp[i+1][(j+1) % 2][lefts][rights], dp[i][j][left][right]);
						}
					}
				}
			}
			
			int ans = INF;
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 3; k++){
						ans = Math.min(ans, dp[len-1][i][j][k]);
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}