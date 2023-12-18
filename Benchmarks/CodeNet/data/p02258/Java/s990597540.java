import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt(); 
		int[] arr = new int[n]; 
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt(); 
		}
		System.out.println(computeMaxProfit2(arr, n)); 
	}

	private static int computeMaxProfit(int[] arr, int n) {
		int maxProfit = -999999999; 
		for(int i = 0; i < n-1; i++) {
			for (int j = i+1; j<n; j++) {
				if(arr[j] - arr[i] > maxProfit)
					maxProfit = arr[j] - arr[i]; 
			}
		}
		return maxProfit; 
		
	}
	private static int computeMaxProfit2(int[] arr, int n) {
		int maxProfit = -999999999; 
		int min = arr[0];

		for (int i = 1; i < n; i++) {
			maxProfit = Math.max(maxProfit, arr[i] - min);
			min = Math.min(min, arr[i]);
		}
		return maxProfit;
	}

}
