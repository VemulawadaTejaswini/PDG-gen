

import java.util.Scanner;

public class Main {

	  //given n times, and R, an array of currencies/rates
	public int compute_maxprofit(int n,int[] R) {
		int max_profit = -999999999;
		int min_price = R[0];
		for(int i = 0; i < n -1; i ++) {
			if(R[i] < min_price) {
				min_price = R[i];
			}
			max_profit = Math.max(max_profit, R[i+1] - min_price);
		}
		return max_profit;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rSize = in.nextInt();
		int[] R = new int[rSize];
		
		for(int i = 0; i < rSize; i++) {
			R[i] = in.nextInt();
		}
		
		Main test = new Main();
		System.out.println(test.compute_maxprofit(rSize, R));
	}
}

