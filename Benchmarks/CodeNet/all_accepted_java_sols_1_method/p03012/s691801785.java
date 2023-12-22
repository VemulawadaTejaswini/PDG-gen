
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		int[]w = new int[n];
		int sum = 0;
		
		
		for (int i=0;i<n;i++) {
			w[i]= sc.nextInt();
			sum+=w[i];
		}
		
		int ans = Integer.MAX_VALUE;
		int smallSum=0;
		for (int i=0;i<n;i++) {
			
			
			ans = Math.min(ans, Math.abs(sum-smallSum-smallSum));
			smallSum+=w[i];
		}
		
		System.out.println(ans);
	}
}
