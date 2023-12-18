import java.util.Scanner;

public class Main {/* Longest Increasing Subsequence */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n], map_dp = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		int max = 0;
		for(int i = 0; i < n; i++){
			int lastLIS = i - 1;
			int count = 1;/* i????????????????????? */
			for(int j = i - 1; j >= 0; j--){
				/* j == i - 1?????¨?????????????????????????????? */
				if(a[j] < a[lastLIS] || (j == i - 1 && a[lastLIS] < a[i])){
					if(map_dp[j] != 0){
						count = count + map_dp[j];
						break;
					}
					count++;
					lastLIS = j;
				}
			}
			map_dp[i] = count;
			if(max < count){
				max = count;
			}
		}
		
		System.out.println(max);
	}
}