import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int aSum = 0, bSum = 0;
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			for(int i = 0; i < n; ++i)
			{
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				if(a > b)
				{
					aSum += a + b;
				}
				else if(a < b)
				{
					bSum += a + b;
				}
				else
				{
					aSum += a;
					bSum += a;
				}
			}
			System.out.println(aSum + " " + bSum);
		}
	}
}