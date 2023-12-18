import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int aSum = 0, bSum = 0;
			for(int i = 0; i < 4; ++i)
			{
				int a = stdIn.nextInt();
				aSum += a;
			}
			for(int i = 0; i < 4; ++i)
			{
				int b = stdIn.nextInt();
				bSum += b;
			}
			if(aSum >= bSum)
			{
				System.out.println(aSum);
			}
			else
			{
				System.out.println(bSum);
			}
		}
	}
}