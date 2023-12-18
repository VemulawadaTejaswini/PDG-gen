import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		boolean firstFlag = true;
		while(stdIn.hasNext())
		{
			int count = 0;
			if(!firstFlag)
			{
				System.out.println();
			}
			firstFlag = false;
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			if(a == 0 && b == 0)
			{
				break;
			}
			for(int i = a; i <= b; ++i)
			{
				if(i % 4 == 0)
				{
					if(i % 100 == 0 && i % 400 == 0)
					{
						System.out.println(i);
						++count;
					}
					else if(i % 100 != 0)
					{
						System.out.println(i);
						++count;
					}
				}
			}
			if(count == 0)
			{
				System.out.println("NA");
			}
		}
	}
}