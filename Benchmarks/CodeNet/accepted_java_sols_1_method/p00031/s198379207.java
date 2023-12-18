import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int w = scanner.nextInt();
			int wsum = 0;
			
			for(int i=0; (i<10 || w>0); i++,w/=2)
			{
				if(w%2 == 1)
				{
					System.out.print((int)Math.pow(2, i));
					if(w/2 > 0)
					{
						System.out.print(" ");
					}
				}				
			}
			System.out.println("");
		}
	}
}