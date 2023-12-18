

import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int m;
		int n;
		
		while(true)
		{
			m = scan.nextInt();
			n = scan.nextInt();
			
			if(m == 0 && n == 0)
			{
				return;
			}
			else
			{
				new DataSet();
			}
		}

	}
	
	static class DataSet
	{
		
	}

}

