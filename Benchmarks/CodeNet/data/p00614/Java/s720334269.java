import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 1000;
	
	public static final int[] coins = new int[]{1, 5, 10, 50, 100, 500};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int DP_MAX = 0;
		for(int coin : coins){
			DP_MAX += coin * MAX;
		}
		
		int[] DP = new int[DP_MAX + 1];
		
		while(true){
			final int P = sc.nextInt();
			
			if(P == 0){
				break;
			}
			
			Arrays.fill(DP, Integer.MIN_VALUE);
			DP[0] = 0;
			
			int[] coin_nums = new int[6];
			for(int i = 0; i < 6; i++){
				coin_nums[i] = sc.nextInt();
			}
			
			for(int coin_type = 0; coin_type < 6; coin_type++){
				for(int target = DP_MAX; target >= 0; target--){
					if(DP[target] < 0){
						continue;
					}
					
					for(int coin = 1; coin <= coin_nums[coin_type]; coin++){
						final int next = target + coins[coin_type] * coin;
						
						if(next > DP_MAX){
							break;
						}
						
						if(DP[next] < 0 || DP[next] > DP[target] + coin){
							DP[next] = DP[target] + coin;
						}
					}
				}
			}
			
			int min = Integer.MAX_VALUE;
			for(int i = P; i < DP_MAX; i++){
				if(DP[i] >= 0 && DP[i - P] >= 0){
					min = Math.min(min, DP[i] + DP[i - P]);
				}
			}
			
			System.out.println(min);
		}
		
		sc.close();
	}
}