import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[3];
		for(int j=0; j<3; j++) {
			dp[j] = sc.nextInt();
		}
		for(int i=1; i<n; i++) {
			int[] M = new int[3];
			for(int j=0; j<3; j++) {
				int curr = sc.nextInt();
				for(int k=0; k<3; k++) {
					if(j!=k) {
						M[j] = Math.max(M[j], dp[k]+curr);
					}
				}
			}
			dp = M;
		}
		System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));
		
		
		

	}

}
