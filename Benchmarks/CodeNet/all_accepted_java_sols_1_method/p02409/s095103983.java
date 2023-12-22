import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] r = new int[n];
		int[] f = new int[n];
		int[] v = new int[n];
		for(int i=0; i<n; i++)
		{
			int b = scanner.nextInt();
			r[i] = scanner.nextInt();
			f[i] = scanner.nextInt();
			v[i] = scanner.nextInt();
			
			r[i] =  (4*(b-1)  + r[i] - 1);
			f[i] = f[i]*2 - 1;
		}
		
		String[][]  s = new String[15][20];
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<20; j++)
			{
				if(i%4 == 3)
				{
					s[i][j] = "#";
				}
				else if(j%2 == 0)
				{
					s[i][j] = " ";
				}
				else {
					s[i][j] = "0";
				}
			}
		}
			for(int i=0; i<15; i++)
			{
				for(int j=1; j<20; j+=2)
				{
					for(int k=0; k<n; k++)
					{
						if(r[k]==i && f[k]==j)
						{
							int in = Integer.parseInt(s[i][j])+v[k];
							if(in > 9)
							{
								in = 9;
							}
							s[i][j] = in+"";
						}
					}
			}
		}
		
		
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<20; j++)
			{
				System.out.print(s[i][j]);
			}
			System.out.println("");
		}
	}
}