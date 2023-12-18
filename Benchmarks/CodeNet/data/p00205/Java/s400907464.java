import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int[] hand = new int[5];
			hand[0] = stdIn.nextInt();
			if(hand[0] == 0)
			{
				break;
			}
			for(int i = 1; i < 5; ++i)
			{
				hand[i] = stdIn.nextInt();
			}
			int rockCount = 0;
			int paperCount = 0;
			int scissorsCount = 0;
			for(int i = 0; i < 5; ++i)
			{
				if(hand[i] == 1)
				{
					++rockCount;
				}
				else if(hand[i] == 2)
				{
					++scissorsCount;
				}
				else
				{
					++paperCount;
				}
			}
			if((rockCount >= 1 && scissorsCount >= 1 && paperCount >= 1)
				|| (rockCount == 0 && scissorsCount == 0) 
				|| (scissorsCount == 0 && paperCount == 0) 
				|| (paperCount == 0 && rockCount == 0))
			{
				for(int i = 0; i < 5; ++i)
				{
					System.out.println("3");
				}
			}
			else if(rockCount == 0)
			{
				for(int i = 0; i < 5; ++i)
				{
					if(hand[i] == 2)
					{
						System.out.println("1");
					}
					else
					{
						System.out.println("2");
					}
				}
			}
			else if(scissorsCount == 0)
			{
				for(int i = 0; i < 5; ++i)
				{
					if(hand[i] == 3)
					{
						System.out.println("1");
					}
					else
					{
						System.out.println("2");
					}
				}
			}
			else if(paperCount == 0)
			{
				for(int i = 0; i < 5; ++i)
				{
					if(hand[i] == 1)
					{
						System.out.println("1");
					}
					else
					{
						System.out.println("2");
					}
				}
			}
		}
	}
}