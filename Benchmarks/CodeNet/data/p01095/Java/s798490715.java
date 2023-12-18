

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int shortest;
		int blocks;
		
		while(true)
		{
			shortest = scan.nextInt();
			blocks = scan.nextInt();
			
			if(shortest == 0 && blocks == 0)
			{
				return;
			}
			else
			{
				new DataSet(shortest, blocks);
			}
		}
	}
	
	static class DataSet
	{
		int shortest;
		int blocks;
		List<Integer> block = new ArrayList<Integer>();
		
		public DataSet(int s, int b)
		{
			shortest = s;
			blocks = b;
			
			block.add(s);
			int year = s;
			
			while(block.size() < blocks)
			{ //selama masih bisa nanem yg baru
//				System.out.println("Year " + year + ", trees " + block.size());
				
				year += 1; //go to next year without.
				//cek ada yg mekar ato enggak.
				
				if(!yearHasBloom(year))
				{
					//kalo enggak ada yg mekar mesti tanem yg mekar di taun ini!
					block.add(year); //mestinya jadiin bilangan prima
//					System.out.println("Planted on block " + block.size() + ": " + year);
				}
			}
			
			System.out.println(block);
			
			while(true)
			{
				System.out.println("Year " + year);
				if(!yearHasBloom(year))
				{
					System.out.println(year);
					return;
				}
				year += 1;
			}
			
		}
		
		int nextDullYear(int year)
		{
			
			
			return 0;
		}
		
		boolean yearHasBloom(int year)
		{
			if(block.contains(year)) {return true;}
			for(int plant : block)
			{
				if(year%plant == 0)
				{
					System.out.println("YEAR " + year);
					
					return true;
				}
				
				if(plant > (year/2)) 
				{
					return false;
				}
			}
			
//			System.out.println("year " + year);
			
			return false;
		}

	}
}

