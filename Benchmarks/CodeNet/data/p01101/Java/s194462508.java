

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n;
		int m;
		
		while(true)
		{
			n = scan.nextInt();
			m = scan.nextInt();
			
			if(m == 0 && n == 0)
			{
				return;
			}
			else
			{
				new DataSet(n, m);
			}
		}

	}
	
	static class DataSet
	{
		int money;
		int numOfGoods;
		List<Integer> prices = new ArrayList<Integer>();
		
		public DataSet(int n, int m)
		{
			numOfGoods = n;
			money = m;
			
			for(int i = 0; i < numOfGoods; i++)
			{
				prices.add(scan.nextInt());
			}
			
			int hiscore = 0;
			
			for(int a = 0; a < numOfGoods; a++)
			{
				for(int b = a+1; b < numOfGoods; b++)
				{
					int score = prices.get(a) + prices.get(b);
					
					if(hiscore < score && score <= money){hiscore = score;}
				}
			}
			
			if(hiscore > 0)
			{
				System.out.println(hiscore);
			}
			else
			{
				System.out.println("NONE");
			}
		}
	}

}

