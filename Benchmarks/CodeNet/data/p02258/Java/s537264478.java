
import java.util.Scanner;

public class Main{
	public static int profit(int[] prices){
		int[] sell = new int[prices.length];
		int min = prices[0]; 
		sell[0] = 0 - prices[0];
		for(int i = 1; i < prices.length; i++)
		{
			if(sell[i-1] < prices[i]-min)
			{
				sell[i] = prices[i] - min;
			}else
			{
				sell[i] = sell[i-1];
			}
			if(min > prices[i])
			{
				min = prices[i];
			}
		}
		return sell[prices.length - 1];
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		
		int[] prices = new int[length];
		for(int i = 0; i < length; i++)
		{
			//System.out.print(i);
			prices[i] = in.nextInt();
		}
		
		System.out.println(profit(prices));
	}
}

