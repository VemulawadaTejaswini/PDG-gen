import java.awt.geom.*;
import java.io.*;
import java.util.*;

import javax.naming.BinaryRefAddr;

public class Main {
	//1958 cording
	int [] v = {200,300,500};
	int [] mv = {5,4,3};
	int [] v3 = {380, 550, 850};
	int [] v4 = {80, 85, 88};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] dp = new int[5001];
			int INF = 1 << 24;
			Arrays.fill(dp, INF);
			dp[0] = 0;
			for(int i = 0 ; i < n; i+= 100){
				for(int j = 0 ; j < 3; j++){
					int value = dp[i] + v3[j];
					int next = i + v[j];
					dp[next] = Math.min(dp[next], value);
					value = dp[i] + (v3[j] * mv[j]) * v4[j] / 100;
					next = i + v[j] * mv[j];
					dp[next] = Math.min(dp[next], value);
				}
			}
			System.out.println(dp[n]);
		}
	
	}
	public static void main(String [] args){
		new Main().doit();
	}
}