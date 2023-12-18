

import java.util.Scanner;

public class Main {

	public static int computeMaxProfit(int n, int[] rates) {
		int maxProfit = -100000;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (rates[j] -rates[i] > maxProfit) {
					maxProfit = rates[j] -rates[i];
				}
			}
		}
		return maxProfit;
	}
	
	public static int computeMaxProfitDP(int[] rates) {
		int min = rates[0];
		
		
		int maxProfit[] = new int [rates.length];
//		maxProfit[0] = rates[0];
		maxProfit[1] = rates[1] -min;
		if (min> rates[1]) {
			min = rates[1];
		}
		for (int i = 2; i< rates.length; i++) {
			maxProfit[i] = Math.max(maxProfit[i-1], rates[i] - min);
			
			if (min >rates[i]) {
				min = rates[i];
			}
		}
		return maxProfit[rates.length-1];
			
				
//			if (rates[i] < min[i]) {
//				min[i] = rates[i];
//				maxProfit[i] = rates[i]- min[i];
//			}
//		
//			
//			
//			maxProfit[i] = Math.max(maxProfit[i-1], rates[i]-min);
		
	}
	public static void main(String[] args) {
//		int rates[] = {5,3,1,3,4,3};
//		System.out.println(computeMaxProfit(6, rates));	
//		System.out.println(computeMaxProfitDP(rates));
		
		
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int arr[] = new int [count];

		for(int i = 0; i<count; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(computeMaxProfitDP(arr));
	}

}

