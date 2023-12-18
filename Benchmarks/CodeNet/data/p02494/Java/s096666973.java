import java.util.Scanner;

public class Main
{
	public static void main(String... args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			int x = s.nextInt();
			int y = s.nextInt();
			if(x == 0)
			{
				return;
			}
			for(int i = 0; i < x; i++)
			{
				for(int j = 0; j < y; j++)
				{
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}