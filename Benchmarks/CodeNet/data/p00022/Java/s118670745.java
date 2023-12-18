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
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				int a = stdIn.nextInt();
				list.add(a);
			}
			int max = -99999999;
			for(int i = 0; i < n; ++i)
			{
				int sum = 0;
				for(int j = i; j < n; ++j)
				{
					sum += list.get(j);
					if(sum > max)
					{
						max = sum;
					}
				}
			}
			System.out.println(max);
		}
	}
}