import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int M = stdIn.nextInt();
		int N = stdIn.nextInt();
		int max = 0;
		for(int i = 0; i < M; ++i)
		{
			int count = 0;
			for(int j = 0; j < N; ++j)
			{
				int a = stdIn.nextInt();
				if(a == 1)
				{
					++count;
				}
			}
			if(count > max)
			{
				max = count;
			}
		}
		System.out.println(max);
	}
}