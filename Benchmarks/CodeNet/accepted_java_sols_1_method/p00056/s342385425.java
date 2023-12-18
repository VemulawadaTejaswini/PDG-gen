/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final int MAX_N = 50000;
		Scanner scan = new Scanner(System.in);
		int n;
		boolean[] prime = new boolean[MAX_N + 1];
		for(int i = 0;i < prime.length;i++){
			prime[i] = true;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		prime[0] = prime[1] = false;
		for(int i = 0;i <= MAX_N;i++){
			if(prime[i]){
				al.add(i);
				for(int j = 2 * i;j <= MAX_N;j+=i){
					prime[j] = false;
				}
			}
		}
		int[][] dp = new int[3][MAX_N + 1];
		dp[0][0] = 1;
		for(int i = 0;i < al.size();i++){
			for(int j = 0;j < 2;j++){
				for(int k = 0;k <= MAX_N - al.get(i);k++){
					dp[j + 1][k + al.get(i)] += dp[j][k];
				}
			}
		}
		while(true){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			System.out.println("" + dp[2][n]);
		}
		
	}

}