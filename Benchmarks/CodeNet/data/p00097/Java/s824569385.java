import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static long dfs(int rest, int start, int remain, long[][][] memo){
		if(memo[rest][start][remain] != -1){
			return memo[rest][start][remain];
		}else if(rest == 0){
			return remain == 0 ? 1 : 0;
		}
		
		long ret = 0;
		
		final int limit = Math.min(100, remain);
		for(int cur = start; cur <= limit; cur++){
			ret += dfs(rest - 1, cur + 1, remain - cur, memo);
		}
		
		return memo[rest][start][remain] = ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long[][][] memo = new long[10][101][1001];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j <= 100; j++){
				for(int k = 0; k <= 1000; k++){
					if(i == 0){
						memo[i][j][k] = k == 0 ? 1 : 0;
					}else{
						memo[i][j][k] = -1;
					}
				}
			}
		}
		
		while (true) {
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			
			if(n == 0 && k == 0){
				break;
			}
			
			System.out.println(dfs(n, 0, k, memo));
		}
	}

}