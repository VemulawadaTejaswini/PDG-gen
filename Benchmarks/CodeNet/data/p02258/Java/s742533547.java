import java.util.Scanner;

public class Main {
	
	public static int computeMaxProfit(int n, int[] R) {
		int maxProfit = -2147483648;
		int minPrice = R[0];
		for (int i = 1; i < n; i++) {
			minPrice = Math.min(R[i - 1], minPrice);
			maxProfit = Math.max(maxProfit, R[i] - minPrice);
		}
		
		return maxProfit;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] R = new int[n];
		
		for (int i = 0; i < n; i++) {
			R[i] = scan.nextInt();
		}
			
		System.out.println(computeMaxProfit(n, R));
	}

}

