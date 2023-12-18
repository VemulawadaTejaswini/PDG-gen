import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
	{
		
		int count = 0;
		int temp = 0;
		int tempo = 0;
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			p[i] = sc.nextInt();
		}
		sc.close();
		
		while(count < k)
		{
			for(int i = 0; i < n; i++)
			{
				if(temp == 0)
				{
					temp = p[i];
				}
				if(temp > p[i] && p[i] != 0)
				{
					temp = p[i];
					tempo = i;
				}
				if(i + 1 == n)
				{
					p[tempo] = 0;
				}

			}
			
			answer += temp;
			temp = 0;
			count++;

		}
		
		System.out.println(answer);
		
	}

}