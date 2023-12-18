import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(int n=scanner.nextInt(); n>0; n--)
		{
			int score = 0;
			int runner = 0;
			int out_count = 0;
			
			for(; ;)
			{
				String batter = scanner.next();
				if(batter.equals("HIT"))
				{
					runner ++;
					if(runner == 4)
					{
						score ++;
						runner = 3;
					}
				}
				else if(batter.equals("OUT"))
				{
					out_count ++;
					if(out_count == 3)
					{
						break;
					}
				}
				else if(batter.equals("HOMERUN"))
				{
					score += runner+1;
					runner = 0;
				}
			}
			
			System.out.println(score);
		}
	}
}