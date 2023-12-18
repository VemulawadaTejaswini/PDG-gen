//Max Profit Algorithm 2

import java.util.Scanner;

public class Main {
	public int min_val;
	public int[] max_profits;
	
	public Main(int n){
		max_profits = new int[n];
		min_val = 0;
		max_profits[0] = -99999;
	}
	
	int maxprofit(int n, int[] arr) {
		int max_profit ;
		this.min_val = arr[0];
                max_profit = arr[1] - this.min_val;
		
		for(int i = 1; i < n; i++) {
			this.max_profits[i] = arr[i] - this.min_val;
			
			if(arr[i] < this.min_val) {
				this.min_val = arr[i];
			}
			
			if(max_profits[i] > max_profit) {
				max_profit = max_profits[i];
			}
			
		}
		
		return max_profit;
		
	}
	
	



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		Main m = new Main(n);
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(m.maxprofit(n,arr));

	}

}
