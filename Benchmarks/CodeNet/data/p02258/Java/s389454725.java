import java.util.*;

public class Main {
	static int maxResult(int[] prices) {
		int[] table = new int[prices.length];

		int max = prices[1] - prices[0];
		for(int i = 1; i < table.length; i++) {
			int optionOne = prices[i] - prices[i-1];
			int optionTwo = prices[i] - prices[i-1] + table[i-1];
			table[i] = Math.max(optionOne, optionTwo);
			
			if(table[i] > max) {
				max = table[i];
			}
		}
		return max;
	

	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int[] prices = new int[n];
		for(int i = 0; i < n; i++) {
			prices[i] = in.nextInt();
		}
		System.out.println(maxResult(prices));
		in.close();
	}
}
