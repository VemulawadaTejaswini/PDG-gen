import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] rate = new int[n];
		
		for(int i = 0; i < n; i++) {
			rate[i] = sc.nextInt();
		}
		
		sc.close();
		
		int low = rate[0];
		int max = Integer.MIN_VALUE;
		for(int i = 1; i< n; i++) {
			max = Math.max(max, rate[i] - low);
			low = Math.min(low, rate[i]);
		}
		
		System.out.println(max);
		
	}
}