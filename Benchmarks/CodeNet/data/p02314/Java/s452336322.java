import java.util.*;
import java.math.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] coins = new int[m];
		for(int i = 0; i < m; i++){
			coins[i] = sc.nextInt();
		}
		int[] times = new int[n+1];
		times[0] = 0;
		for(int j = 1; j<= n; j++){
			times[j] = Integer.MAX_VALUE;
		}
		for(int j = 1; j <= n; j++){
			for(int i = 0; i < m; i++){
				if(j - coins[i] >= 0){
					times[j] = Math.min(times[j], times[j-coins[i]]+1);
				}
			}
		}
		System.out.println(times[n] + "\n");
	}
}