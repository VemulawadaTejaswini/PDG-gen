import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int n = stdIn.nextInt();
			int x = stdIn.nextInt();
			
			if(n==0 && x==0)
			{
				break;
			}
			
			int count = 0;
			
			for(int i=n;i>=3;i--)
			{
				for(int j=i-1;j>=2;j--)
				{
					for(int k=j-1;k>=1;k--)
					{
						if((i+j+k)==x)
						{
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
		}
	}
}