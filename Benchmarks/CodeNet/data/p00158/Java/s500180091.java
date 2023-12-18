import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int count = 0;
			while(true)
			{
				if(n == 1)
				{
					break;
				}
				if(n % 2 == 0)
				{
					n /= 2;
				}
				else
				{
					n = 3 * n + 1;
				}
				++count;
			}
			System.out.println(count);
		}
	}
}