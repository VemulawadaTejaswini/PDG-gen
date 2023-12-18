

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)return;
			
			int[] p1 = new int[n];
			int[] p2 = new int[m];
			
			int s1 = 0;
			int s2 = 0;
			
			for(int i = 0; i < n; i++)
			{
				p1[i] = sc.nextInt();
				s1 += p1[i];
			}
			
			for(int i = 0; i < m; i++)
			{
				p2[i] = sc.nextInt();
				s2 += p2[i];
			}
			
			int ans1 = 999;
			int ans2 = 999;
			for(int c1 = 0; c1 < n; c1++)
			{
				for(int c2 = 0; c2 < m; c2++)
				{
					int card1 = p1[c1];
					int card2 = p2[c2];
					if(s1 - card1 + card2 == s2 - card2 + card1 && card1 + card2 < ans1+ans2)
					{
						ans1 = card1;
						ans2 = card2;
					}
				}
			}
			
			if(ans1 == 999 && ans2 == 999)
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(ans1 + " " + ans2);
			}
		}
	}

}

