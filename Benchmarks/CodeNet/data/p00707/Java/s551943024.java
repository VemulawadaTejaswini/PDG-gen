

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int w;
		int h;

		//numbers: ascii 48 ~ 57 are 0 ~ 9
		
		while(true)
		{
			w = scan.nextInt();
			h = scan.nextInt();
			
			if(w == 0 && h == 0)
			{
				break;
			}
			else
			{
				new DataSet(w,h);
			}
			
		}
	}
	
	static class DataSet
	{
		int width;
		int height;
		char[][] grid;
		List<Integer> startX = new ArrayList<Integer>();
		List<Integer> startY = new ArrayList<Integer>();
		
		public DataSet(int w, int h)
		{
			this.width = w;
			this.height = h;
			
			grid = new char[w][h];
			
			for(int row = 0; row < h; row++)
			{
				String str = scan.next();
				
				for(int ch = 0; ch < w; ch++)
				{
					//numbers: ascii 48 ~ 57 are 0 ~ 9
					grid[ch][row] = str.charAt(ch);
					
					//is it a starting point?
					//check X
					if(ch == 0 || charIsNumber(grid[ch-1][row]) == false)
					{
						//check Y
						if(row == 0 || charIsNumber(grid[ch][row-1]) == false)
						{
							startX.add(ch);
							startY.add(row);
						}
					}
				}
			}
			
			
			String biggest = "0";
			
			for(int i = 0; i < startX.size(); i++)
			{
				String att = compute(startX.get(i), startY.get(i), "");
				att = removeZeroesAtStart(att);
				
//				if(Integer.parseInt(att) > Integer.parseInt(biggest))
				if(firstStringIsBigger(att, biggest))
				{
					biggest = "" + att;
//					System.out.println("biggest is now " + biggest);
				}
			}
			
			System.out.println(biggest);
		}
		
		String compute(int x, int y, String con)
		{
			String content = con;
			//ender
			if(x < width && y < height && charIsNumber(grid[x][y]))
			{
				//a number: ADD
				content += grid[x][y];
			}
			else
			{
				//not a number: END
				return con;
			}
			
			//
			
			String right = compute(x+1,y, content);
			String down = compute(x,y+1, content);
			
//			if(Integer.parseInt(right) > Integer.parseInt(down))
			if(firstStringIsBigger(right, down))
			{
				return right;
			}
			else
			{
				return down;
			}
		}
		
		public String removeZeroesAtStart(String a)
		{
			String ans = a;
			
			while(true)
			{
//				System.out.println("checking " + a);
				
				if(a.equals("")) {return a;}
				if(a.charAt(0) == 48)
				{
					a = a.substring(1);
				}
				else
				{
					return a;
				}
			}
		}
		
		boolean firstStringIsBigger(String a, String b)
		{
			a = removeZeroesAtStart(a);
			b = removeZeroesAtStart(b);
			
			if(a.length() > b.length()) {return true;}
			if(a.length() < b.length()) {return false;}
			
			//when length is the same: compare from the 1st digit (most significant)
			
			for(int i = 0; i < a.length(); i++)
			{
				if(a.charAt(i) > b.charAt(i))
				{
					return true;
				}
				if(a.charAt(i) < b.charAt(i))
				{
					return false;
				}
			}
			
			return false;
		}
		
		
		boolean charIsNumber(char c)
		{
			if(c >= 48 && c <= 57)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

}

