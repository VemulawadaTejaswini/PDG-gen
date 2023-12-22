import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			while(true)
			{
				int h = sc.nextInt();
				int w = sc.nextInt();
				
				if(h == 0 && w == 0)
				{
					break;
				}
				else
				{
					for(int i = 0; i < h; i++)
					{
						if(i % 2 == 0)
						{
							for(int j = 0; j < w / 2; j++)
							{
								System.out.print("#.");
							}
							if(w % 2 == 1)
							{
								System.out.print("#\n");
							}
							else
							{
								System.out.print("\n");
							}
						}
						else
						{
							for(int j = 0; j < w / 2; j++)
							{
								System.out.print(".#");
							}
							if(w % 2 == 1)
							{
								System.out.print(".\n");
							}
							else
							{
								System.out.print("\n");
							}
						}
					}
					System.out.print("\n");
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}