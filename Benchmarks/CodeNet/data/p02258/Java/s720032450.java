
import java.util.Scanner;

public class Main {
	
	public static int compute_maxprofit(int n, int[] R)
	{
		int min_buy = R[0];
		int max_profit = Integer.MIN_VALUE;
		for(int i = 1; i < n ; i++)
		{
			if(R[i] - min_buy > max_profit)
			{
				max_profit = R[i] - min_buy;
			}
			if(R[i] < min_buy)
			{
				min_buy = R[i];
			}
		}
		return max_profit;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n ; i++)
		{
			nums[i] = in.nextInt();
		}
		System.out.println(compute_maxprofit(n,nums));
	}
}

