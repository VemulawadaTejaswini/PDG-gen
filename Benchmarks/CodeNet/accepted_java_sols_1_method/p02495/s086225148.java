import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		boolean firstFlag = true;
		while(true)
		{
			int H = stdIn.nextInt();
			int W = stdIn.nextInt();
			if(!firstFlag)
			{
				System.out.println();
			}
			firstFlag = false;
			if(H == 0 && W == 0)
			{
				break;
			}
			for(int i = 0; i < H; ++i)
			{
				boolean charFlag;
				if(i % 2 == 0)
				{
					charFlag = true;
				}
				else
				{
					charFlag = false;
				}
				for(int j = 0; j < W; ++j)
				{
					if(charFlag)
					{
						System.out.print("#");
					}
					else
					{
						System.out.print(".");
					}
					charFlag = !charFlag;
				}
				System.out.println();
			}
		}
	}
}