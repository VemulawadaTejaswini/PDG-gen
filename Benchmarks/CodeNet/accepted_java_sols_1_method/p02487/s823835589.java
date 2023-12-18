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
				if(i == 0 || i == H - 1)
				{
					for(int j = 0; j < W; ++j)
					{
						System.out.print("#");
					}
					System.out.println();
				}
				else
				{
					for(int j = 0; j < W; ++j)
					{
						if(j == 0 || j == W - 1)
						{
							System.out.print("#");
						}
						else
						{
							System.out.print(".");
						}
					}
					System.out.println();
				}
			}
		}
	}
}