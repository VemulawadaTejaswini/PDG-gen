import java.io.IOException;
import java.util.Scanner;

class Main 
{
	private static final int DATE = 100;

	public static void main(String[] args) throws IOException
	{
		int N, Q, M, ans;
		boolean flag;
		int[] date;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			N = sc.nextInt();
			Q = sc.nextInt();
			
			if(N == 0 && Q == 0)
			{
				break;	
			}
			
			date = new int[DATE + 1];
			ans = 0;
			flag = true;

			for(int i = 0; i < N; i++)
			{
				M = sc.nextInt();
				for(int j = 0; j < M; j++)
				{
					date[sc.nextInt()]++;	
				}
				
				if(flag && (ans = search(date, Q)) != 0)
				{
					flag = false;	
				}
			}

			System.out.println(ans);
		}
	}

	private static int search(int[] date, int Q)
	{
		int max = 0, ans = 0;
		for(int i = 0; i < date.length; i++)
		{
			if(Q <= date[i] && max < date[i])
			{
				max = date[i];	
				ans = i;
			}
		}
		
		return ans;
	}
}