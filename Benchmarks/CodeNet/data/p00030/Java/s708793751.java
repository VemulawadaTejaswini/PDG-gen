import java.util.*;
public class Main 
{
	static int n, s, count;
	public static void DFS(int sum, int pre, int depth)
	{
		if(depth > n || sum > s)
		{
			return;
		}
		else if(n == depth && s == sum)
		{
			System.out.println("OK");
			++count;
			return;
		}
		else
		{
			for(int i = pre + 1; i < 10; ++i)
			{
				DFS(sum + i, i, depth + 1);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			n = stdIn.nextInt();
			s = stdIn.nextInt();
			if(n == 0 && s == 0)
			{
				break;
			}
			count = 0;
			for(int i = 0; i < 10; ++i)
			{
				DFS(i, i, 1);
			}
			System.out.println(count);
		}
	}
}