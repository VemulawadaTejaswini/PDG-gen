import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 1000;
	
	public static final int[] coins = new int[]{500, 100, 50, 10, 5, 1};
	
	public static int min_coin(int deep, final int P, int money, int cost, int ans, int[] coin_count){
		if(deep == coin_count.length){
			if(money < P){
				return Integer.MAX_VALUE;
			}else{
				return cost + ret_coin(money - P);
			}
		}
		
		//System.out.println(deep + " " + money + " " + cost + " " + ans);
		
		int lest = 0;
		for(int i = deep; i < coin_count.length; i++){
			lest += coins[i] * coin_count[i];
		}
		
		if(lest + money < P){
			return Integer.MAX_VALUE;
		}
		
		for(int count = coin_count[deep]; count >= 0; count--){
			final int prev_num = money + coins[deep] * (count - 1);
			
			if(count != 0 && prev_num > P){
				continue;
			}else if(cost + count >= ans){
				continue;
			}
			
			ans = Math.min(ans, min_coin(deep + 1, P, money + count * coins[deep], cost + count, ans, coin_count));
		}
		
		return ans;
	}
	
	public static final int ret_coin(int P){
		int ret = 0;
		
		for(int i = coins.length - 1; i >= 0; i--){
			final int t = P / coins[i];
			
			ret += t;
			
			P -= t * coins[i];
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int P = sc.nextInt();
			
			if(P == 0){
				break;
			}
			
			int[] coin_nums = new int[6];
			for(int i = 0; i < 6; i++){
				coin_nums[5 - i] = sc.nextInt();
			}
			
			System.out.println(min_coin(0, P, 0, 0, Integer.MAX_VALUE, coin_nums));
		}
		
		sc.close();
	}
}