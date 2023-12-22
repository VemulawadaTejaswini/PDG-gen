import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int[] x = new int[50];
		int[] y = new int[50];
		
		while(true)
		{
			int n = stdIn.nextInt();
			int r = stdIn.nextInt();
			
			if(n==0 && r==0)
			{
				break;
			}
			
			if((n>=1 && n<=50) && (r>=1 && r<=50))
			{
			for(int i=0;i<n;i++)
			{
				x[i] = n-i;
			}
			
			for(int i=0;i<r;i++)
			{
				int s = stdIn.nextInt();
				int t = stdIn.nextInt();
				
				if(s<=n+1-t)
				{
					for(int j=0;j<t;j++)
					{
						y[j] = x[s+j-1];
					}	
				
					for(int j=0;j<s-1;j++)
					{
						y[t+j] = x[j];
					}	
				
					for(int j=0;j<s+t-1;j++)
					{
						x[j] = y[j];
					}
				}
				
			}
			
			System.out.println(x[0]);
		}
		}
	}

}