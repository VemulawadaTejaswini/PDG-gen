import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static int[] vx = new int[]{0,1,0,-1};
	static int[] vy = new int[]{1,0,-1,0};
	static int[] Y  = new int[]{0,0,0,1,1,1,2,2,2};
	static int[] X  = new int[]{0,1,2,0,1,2,0,1,2};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			char s = sc.next().charAt(0);
			int S = s - 'A';
			char t = sc.next().charAt(0);
			int T = t - 'A';
			char b = sc.next().charAt(0);
			int B = b - 'A';
			int[][][] dp = new int[n+1][3][3];
			dp[0][Y[S]][X[S]] = 1;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 3; j++) {
					for(int k = 0; k < 3; k++) {
						for(int l = 0; l < 4; l++) {
							int ty = j + vy[l];
							int tx = k + vx[l];
							if(ty < 0 || tx < 0 || tx >= 3 || ty >= 3 || (ty == Y[B] && tx == X[B])) {
								ty = j;
								tx = k;
							}
							dp[i+1][ty][tx] += dp[i][j][k];
						}
					}
				}
			}
			int sum = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					sum += dp[n][i][j];
				}
			}
			System.out.printf("%.25f",dp[n][Y[T]][X[T]] / (double)sum);
			
		}
	}
 }