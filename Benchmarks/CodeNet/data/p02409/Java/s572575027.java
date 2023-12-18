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
			f[i] = scanner.nextInt()-1;
			v[i] = scanner.nextInt();
			
			r[i] =  (4*(b-1)  + r[i] - 1)*2;
			f[i] *= 2;
		}
		
		String[][]  s = new String[15][20];
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<19; j++)
			{
				if(i%4 == 3)
				{
					s[i][j] = "#";
				}
				else if(j%2 == 1)
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
				for(int j=0; j<20; j+=2)
				{
					for(int k=0; k<n; k++)
					{
						if(r[k]==i && f[k]==j)
						{
							s[i][j] = v[k]+"";
						}
					}
			}
		}
		
		
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<19; j++)
			{
				System.out.print(s[i][j]);
			}
			System.out.println("");
		}
	}
}