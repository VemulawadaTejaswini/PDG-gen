import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] array;
	static int[][]dp;
	static int n;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static void solve(){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		int A = 0, B = 0;
		for(int i = 0; i < dp.length; i++){
			for(int j = 0; j < dp[0].length; j++){
				dp[i][j] = 1<<29;
			}
		}
		for(int i = 0; i < dp[0].length; i++){
			dp[0][i] = Math.abs(sum - array[i]);
		}
		for(int i = 1; i < array.length; i++){
			for(int j = i; j < array.length; j++){
				dp[i][j] = (Math.min(dp[i][j], Math.abs(dp[i-1][j-1] - array[j])))*2;
			}
		}
		int res = 1<<29;
		for(int i = 0; i < dp.length; i++){
			for(int j = 0; j < dp[0].length; j++){
				res = Math.min(res, Math.abs(sum - dp[i][j]));
			}
		}
		System.out.println(res);
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		array = new int[n];
		dp = new int[n][n];
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		return true;
	}
	
	static void printDP(){
		for(int i = 0; i < dp.length; i++){
			for(int j = 0; j < dp[0].length; j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}

}