import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int []R = new int[n];
		
		for (int i = 0; i<n; i++) {
			R[i] = sc.nextInt();
		}
		
		int min = R[0];
		int ans = -Integer.MAX_VALUE;
		
		for (int i = 1; i < n; i++) {
			ans = Math.max(ans, R[i] - min);
			min = Math.min(min, R[i]);
		}
		System.out.println(ans);
	}
}
