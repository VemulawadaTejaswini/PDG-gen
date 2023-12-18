import java.util.Arrays;
import java.util.Scanner;

public class Main {/* Longest Increasing Subsequence */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n], memo = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			memo[i] = 1;
		}

		for(int i = 1; i < n; i++){
			int max = 0;
			for(int j = i - 1; j >= 0; j--){
				/* i????????????a[]???????????????a[i]>a[j]??????memo[j]????????§??? */
				if(max < memo[j] && a[j] < a[i]){
					max = memo[j];
				}
			}
			memo[i] = max + 1;
		}
		
		Arrays.sort(memo);
		System.out.println(memo[n-1]);
	}
}