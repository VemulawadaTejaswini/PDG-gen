import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	int [] dp;
	int max = 1000;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] value = new int[n];
			int [] number = new int[n];
			for(int i = 0; i < n; i++){
				value[i] = sc.nextInt();
				number[i] = sc.nextInt();
			}
			
			dp = new int[max + 1];
			for(int i = 0; i < n; i++){
				for(int k = max; k > 0; k--){
					if(dp[k] > 0){
						for(int j = 1; j <= number[i]; j++){
							int ind = value[i] * j + k;
							if(ind > max) continue;
							dp[ind] += dp[k];
						}
						
					}
				}
				
				for(int j = 1; j <= number[i]; j++){
					int ind = value[i] * j;
					if(ind > max) continue;
					dp[ind]++;
				}
			}
			
			int m = sc.nextInt();
			StringBuilder ans = new StringBuilder();
			while(m-- > 0){
				int input = sc.nextInt();
				ans.append(dp[input] + "\n");
			}
			System.out.print(ans.toString());
		}
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}