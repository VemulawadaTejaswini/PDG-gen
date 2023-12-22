import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int[] a = new int[2];
			a[0] = scanner.nextInt();
			a[1] = scanner.nextInt();
			
			int b = scanner.nextInt();
			
			boolean[] use_card = new boolean[10];
			for(int i=0; i<10; i++)
			{
				int j = i+1;
				if(j==a[0] || j==a[1] || j==b)
				{
					use_card[i] = true;
				}
				else
				{
					use_card[i] = false;
				}
			}
			
			int cnt = 0;
			for(int i=0; i<10; i++)
			{
				if(!use_card[i] && a[0]+a[1]+i+1<=20)
				{
					cnt++;
				}
			}
			
			System.out.println(cnt<4 ? "NO" : "YES");
		}
	}
}