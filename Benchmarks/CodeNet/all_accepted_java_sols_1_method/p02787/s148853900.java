import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int h = sc.nextInt();
			int n = sc.nextInt();
			
			int[] aArray = new int[n];
			int[] bArray = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				bArray[i] = sc.nextInt();
			}
			
			// counstruct dp
			// calc minimum magic points for hp = i
			int[] dp = new int[h+1];
			dp[0] = 0;
			for(int i = 1 ; i < h+1 ; i++ ) {
				
				int total = Integer.MAX_VALUE; 
				for(int j = 0 ; j < n ; j++) {
					int current = 0;
					if ( i - aArray[j] > 0 ) {
						current += dp[i - aArray[j]];
					}
					current += bArray[j];
					
					if ( current < total ) {
						total = current;
					}
				}
				dp[i] = total;				
			}

			System.out.println(dp[h]);

		}
			
	}
}