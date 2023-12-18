import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if(n==0 && m==0)
			{
				break;
			}
			
			boolean[] pass = new boolean[n];
			
			int p = -1;
			for(int i=0; i<n-1; i++)
			{
				for(int j=0; j<m;)
				{
					p = ++p%n;
					
					if(!pass[p])
					{
						j++;
					}
				}
				pass[p] = true;
			}
			
			for(int i=0; i<n; i++)
			{
				if(!pass[i])
				{
					System.out.println(String.valueOf(i+1));
					break;
				}
			}
		}
	}
}