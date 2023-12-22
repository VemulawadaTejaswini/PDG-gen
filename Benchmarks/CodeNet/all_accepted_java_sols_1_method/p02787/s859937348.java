import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		int dp[] = new int[H + 1];
		Arrays.fill(dp, Integer.MAX_VALUE / 2);
		dp[0] = 0;
		for(int i = 0 ; i < N ; ++i){
			int next[] = dp.clone();
			int a = A[i];
			int b = B[i];
			for(int h = 0 ; h <= H ; ++h){
				if(h + a >= H){
					next[H] = Math.min(next[H], dp[h] + b);
					next[H] = Math.min(next[H], next[h] + b);
				}else{
					next[h + a] = Math.min(next[h + a], dp[h] + b);
					next[h + a] = Math.min(next[h + a], next[h] + b);
				}
			}
			dp = next;
		}
		System.out.println(dp[H]);
//		System.out.println(Arrays.toString(dp));
	}
}
