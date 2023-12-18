import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			long x = stdIn.nextInt();
			long ans = 0;
			
			if(x == 0)
			{
				break;
			}
			
			while(true)
			{
				if(x==0)
				{
					break;
				}
				int k = x % 10;
				x = x/10;
				ans += k;
			}
			System.out.println(ans);
		}
	}
}