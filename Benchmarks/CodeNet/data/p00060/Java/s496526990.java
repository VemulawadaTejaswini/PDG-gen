import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int[] c = new int[3];
			for(int i = 0; i < c.length; ++i)
			{
				c[i] = stdIn.nextInt();
			}
			boolean[] flag = new boolean[11];
			for(int i = 0; i < flag.length; ++i)
			{
				flag[i] = true;
			}
			flag[c[0]] = flag[c[1]] = flag[c[2]] = false;
			int sum = c[0] + c[1];
			int count = 0;
			for(int i = 1; i < flag.length; ++i)
			{
				if(flag[i] && sum + i <= 20)
				{
					++count;
				}
			}
			if(count >= 4)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}