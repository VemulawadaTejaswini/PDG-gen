import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] weight = new int[n];
		
		for(int i = 0; i < n; i++) {
			weight[i] = stdIn.nextInt();
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n-1; i++) {
			int sum1 = 0;
			int sum2 = 0;
			int j = 0;
			for( j = 0; j < i+1; j++) {
				sum1 += weight[j];
				}
			for(int k = j; k < n; k++) {
				sum2 += weight[k];
			}
			ans = Math.min(ans, Math.abs(sum1-sum2));
		}
		
		
		System.out.println(ans);
		
		
	}

}
