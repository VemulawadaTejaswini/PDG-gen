import java.util.Arrays;
import java.util.Scanner;

public class Main {/* Longest Increasing Subsequence */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n], memo = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			memo[i] = -1;
		}

		for(int i = 0; i < n ; i++){
			int max = 1;
			for(int j = i - 1; j >= 0; j--){
				if(memo[j] == -1 && memo[j] > max){
					max = memo[j];
				}
			}
			memo[i] = max;
		}
		
		Arrays.sort(memo);
		System.out.println(memo[n - 1]);
	}
	
}