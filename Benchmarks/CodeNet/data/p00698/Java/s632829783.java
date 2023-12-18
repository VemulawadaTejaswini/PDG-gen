

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int height; //products
		int width; //stores
		
		while(true)
		{
			height = scan.nextInt();
			
			if(height == 0) {break;}
			width = scan.nextInt();
			
			new DataSet(height+1, width+1);
		}
	}

	static class DataSet
	{
		int height; //products
		int width; //stores
		String[][] value;
		List<Integer> qmEntriesX = new ArrayList<Integer>();
		List<Integer> qmEntriesY = new ArrayList<Integer>();
		int solved = 0;
		
		public DataSet(int h, int w)
		{
//			System.out.println("New DataSet");
			height = h;
			width = w;
			
			value = new String[w][h];
			
			for(int y = 0; y < h; y++)
			{
				for(int x = 0; x < w; x++)
				{
					value[x][y] = scan.next();
					
					if(value[x][y].equals("?"))
					{
						qmEntriesX.add(x);
						qmEntriesY.add(y);
					}
				}
			}
			
//			System.out.println("anything");
//			scan.next();
			
			boolean stillWorking = true;
			
			while(stillWorking == true)
			{
				stillWorking = false;
				
				//go for rows first
				
				for(int y = 0; y < h; y++)
				{
					int unknowns = 0; //number of ?s for thisrow
					int unkX = 0;
					int restSum = 0;
					int actualSum = 0;
					
					for(int x = 0; x < w; x++)
					{
						if(value[x][y].equals("?"))
						{
							unknowns += 1;
							unkX = x;
						}
						else
						{
							if(x < w-1)
							{
								restSum += Integer.parseInt(value[x][y]);
							}
						}
					}
					
					if(unknowns == 1)
					{
						solved += 1;
						stillWorking = true;
						
						//actualSum
						if(value[w-1][y].equals("?"))
						{ //only unknown one is sum
							value[w-1][y] = Integer.toString(restSum);
						}
						else
						{ //only unknown one is some not-sum entry
							actualSum = Integer.parseInt(value[w-1][y]);
							
							value[unkX][y] = Integer.toString(actualSum - restSum);
//							System.out.println("[p1]" + unkX + " " + y + " SET TO " + value[unkX][y]);
						}
					}
				}
				
				//go for the columns
				//COPY PASTE
				
				for(int x = 0; x < w; x++)
				{
					int unknowns = 0; //number of ?s for thisrow
					int unkY = 0;
					int restSum = 0;
					int actualSum = 0;
					
					for(int y = 0; y < h; y++)
					{
//						System.out.println("Checking " + x + " " + y);
						if(value[x][y].equals("?"))
						{
							unknowns += 1;
//							System.out.println("? found at " + x + " " + y + ", now " + unknowns);
							unkY = y;
						}
						else
						{
							if(y < h-1)
							{
								restSum += Integer.parseInt(value[x][y]);
							}
						}
					}
					
					if(unknowns == 1)
					{
						solved += 1;
						stillWorking = true;
						
						//actualSum
						if(value[x][h-1].equals("?"))
						{ //only unknown one is sum
							value[x][h-1] = Integer.toString(restSum);
						}
						else
						{ //only unknown one is some not-sum entry
							actualSum = Integer.parseInt(value[x][h-1]);
							
							value[x][unkY] = Integer.toString(actualSum - restSum);
//							System.out.println("[p2]" + x + " " + unkY + " SET TO " + value[x][unkY]);
						}
					}
				}				
				//COPY PASTE
			}
			
			if(solved == qmEntriesX.size())
			{
				for(int i = 0; i < qmEntriesX.size(); i++)
				{
					System.out.println(value[qmEntriesX.get(i)][qmEntriesY.get(i)]);
				}
			}
			else
			{
				System.out.println("NO");
			}
			
		}
	}
}

