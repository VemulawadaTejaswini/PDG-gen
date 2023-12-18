import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String in = scanner.next();
			String[] w = in.split(",");
			
			int[] n = new int[5];
			for(int i=0; i<5; i++)
			{
				n[i] = Integer.parseInt(w[i]);
			}
			
			for(int i=0; i<5; i++)
			{
				for(int j=i+1; j<5; j++)
				{
					if(n[i] > n[j])
					{
						int buf = n[i];
						n[i] = n[j];
						n[j] = buf;
					}
				}
			}
			
			int strate = 1;
			int pair = 1;
			int pair_max = 0;
			int pair_cnt = 0;
			for(int i=1; i<5; i++)
			{
				if(n[i] == n[i-1])
				{
					pair ++;
				}
				else
				{
					if(pair > pair_max)
					{
						pair_max = pair;
					}
					if(pair > 1)
					{
						pair_cnt ++;
					}
					pair = 1;
				}
				
				if(strate > 0)
				{
					if(n[i] == n[i-1]+1)
					{
						strate ++;
					}
					else
					{
						if(strate==1 && n[4]==13 && n[0]==1)
						{
							strate ++;
						}
						else 
						{
							strate = 0;
						}			
					}
				}
			}
			
			if(pair > pair_max)
			{
				pair_max = pair;
			}
			if(pair > 1)
			{
				pair_cnt ++;
			}
								
			int result = 0;
			switch(pair_max)
			{
				case 2:
					if(pair_cnt == 2)
					{
						result = 2;
					}
					else 
					{
						result = 1;
					}
					break;
				case 3:
					if(pair_cnt == 2)
					{
						result = 5;
					}
					else 
					{
						result = 3;
					}
					break;
				case 4:
					result = 6;
					break;
			}
			
			if(strate == 5)
			{
				result = 4;
			}

			
			String[] out =
				{
					"null",
					"one pair",
					"two pair",
					"three card",
					"straight",
					"full house",
					"four card",
				};
			System.out.println(out[result]);
		}
	}
}