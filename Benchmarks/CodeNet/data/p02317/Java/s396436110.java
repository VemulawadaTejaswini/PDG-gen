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

		int max = 0;
		for(int i = 1; i < n; i++){
			int count = 0;
			for(int j = i - 1; j >= 0; j--){
				/* i????????????a[]???????????????a[i]>a[j]??????memo[j]????????§??? */
				if(count < memo[j] && a[j] < a[i]){
					count = memo[j];
				}
			}
			memo[i] = count + 1;
			if(max < memo[i]) max = memo[i];
		}
		
		System.out.println(max);
	}
}