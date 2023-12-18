import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int n = stdIn.nextInt();
			int p = stdIn.nextInt();
			
			if(n==0 && p==0)
			{
				break;
			}
			
			int[] x = new int[50];
			int y = p;
			int z = 0;
			
			for(int i=0;i<50;i++)
			{
				x[i] = 0;
			}
			
			while(z == 0)
			{
				for(int i=0;i<n;i++)
				{
					if(y==0)
					{
						y = x[i];
						x[i] = 0;
					}
					else
					{
						y--;
						x[i]++;
						if(x[i]==p)
						{
							System.out.println(i);
							z++;
						}
					}
				}
			}
			
		}
	}

}