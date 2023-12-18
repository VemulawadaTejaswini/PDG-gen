import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if(x == 0 && y == 0 && z == 0) break;
			int[] v = new int[x];
			for(int i = 0; i < x; i++) {
				v[i] = sc.nextInt();
			}
			
			int[] n = new int[z];
			int[] e = new int[z];
			int[] A = new int[z];
			
			
			for(int i = 0; i < z; i++) {
				n[i] = sc.nextInt();
				e[i] = sc.nextInt();
				A[i] = sc.nextInt();
			}
			
			long[][] dp = new long[y+1][y+100];
			for(int i = 0; i < y+1; i++) {
				Arrays.fill(dp[i], -1);
			}
			dp[0][0] = 0;
			
			for(int i = 0; i < dp.length-1; i++) {
				for(int j = 0; j < dp[i].length; j++) {
					if(dp[i][j] == -1) continue;
					for(int k = 0; k < x; k++) {
						int to = Math.min(y, i + v[k]);
						long money = dp[i][j];
						for(int l = 0; l < z; l++) {
							if(n[l] != to) continue;
							switch(e[l]) {
							case 1: to = Math.min(to + A[l], y); break;
							case 2: money += A[l]; break;
							case 3: money = Math.max(money - A[l], 0); break;
							}
						}
						if(dp[to][j+1] == -1) dp[to][j+1] = 0;
						dp[to][j+1] += money;
					}
				}
			}
			double ans = 0;
			double tmp = 1.0;
			
			for(int i = 0; i < dp[y].length; i++) {
				if(dp[y][i] == -1) {
					tmp *= (1.0/x);
					continue;
				}
				ans += dp[y][i] * tmp;
				tmp *= (1.0/x);
			}
			
			
			
			
			
			System.out.println((int)ans);
			
		}
		
	}

	
}