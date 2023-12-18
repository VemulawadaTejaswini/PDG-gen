import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			int n = sca.nextInt();
			if(n == 0) break;
			
			int[] houx = new int[n];
			int[] houy = new int[n];
			int[] got = new int[n];
			int i;
			for(i = 0;i < n;i++)
			{
				houx[i] = sca.nextInt();
				houy[i] = sca.nextInt();
				
				if(houx[i] == 10 && houy[i] == 10)
					got[i] = 1;
				else
					got[i] = 0;
			}
			
			int m = sca.nextInt();
			
			String[] muki = new String[m];
			int[] idouryou = new int[m];
			for(i = 0;i < m;i++)
			{
				muki[i] = sca.next();
				idouryou[i] = sca.nextInt();
			}
			
			int x = 10;
			int y = 10;
			int j, k;
			for(i = 0;i < m;i++)
			{
				for(j = idouryou[i];j > 0;j--)
				{
					switch(muki[i])
					{
					case "N": y++; break;
					case "E": x++; break;
					case "S": y--; break;
					case "W": x--; break;
					}
					
					for(k = 0;k < n;k++)
					{
						if(got[k] == 1) continue;
						
						if(houx[k] == x && houy[k] == y) got[k] = 1;
					}
				}
			}
			
			for(i = 0;i < n;i++)
			{
				if(got[i] == 0) break;
			}
			if(i == n)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}