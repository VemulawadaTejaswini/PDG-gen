import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{	
		boolean not[] = new boolean[1000000];
		
		not[0] = true;
		not[1] = true;
		
		for (int i = 2; i * i < 1000000; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 1000000; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int count = 0;
			int n;
			try
			{
				n = sc.nextInt();
			}
			catch(Exception e)
			{
				break;
			}
			for (int i = 2; i <= n; i++)
			{
				if (not[i] == false) count++;
			}
			System.out.println(Integer.toString(count));
		}
	}
}