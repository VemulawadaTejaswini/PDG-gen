
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			int q = sc.nextInt();
			
			if(n == 0)return;
			
			int[] arr = new int[100];
			
			for(int i = 0; i < n; i++)
			{
				int m = sc.nextInt();
				
				for(int j = 0; j < m; j++)
				{
					arr[sc.nextInt()] += 1;
				}
			}
			
			int bestd = 0;
			int mostn = q-1;
			for(int i = 0; i < 100; i++)
			{
				if(arr[i] > mostn)
				{
					bestd = i;
					mostn = arr[i];
				}
			}
			
			System.out.println(bestd);
		}
	}

}

