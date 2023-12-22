import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0)
			{
				break;
			}
			Queue<Boolean> deq = new ArrayDeque<Boolean>();
			boolean[] flag = new boolean[n];
			for(int i = 0; i < n; ++i)
			{
				flag[i] = true;
			}
			int remain = n;
			int pos = 0;
			int count = 0;
			while(remain != 1)
			{
				if(pos >= n)
				{
					pos = 0;
				}
				if(flag[pos])
				{
					++count;
				}
				if(count == m)
				{
					flag[pos] = false;
					count = 0;
					--remain;
				}
				++pos;
			}
			for(int i = 0; i < n; ++i)
			{
				if(flag[i])
				{
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
}