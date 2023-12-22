import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int w = scanner.nextInt();			
			for(int i=0; w>0; i++,w>>=1)
			{
				if(w%2 == 1)
				{
					System.out.print((int)Math.pow(2, i) + (w/2>0?" ":""));
				}				
			}
			System.out.println("");
		}
	}
}