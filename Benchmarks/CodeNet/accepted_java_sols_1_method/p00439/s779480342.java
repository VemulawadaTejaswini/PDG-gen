import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			int k = stdIn.nextInt();
			if(n == 0 && k == 0)
			{
				break;
			}
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				int a = stdIn.nextInt();
				list.add(a);
			}
			int max = 0;
			int sum = 0;
			for(int i = 0; i < k; ++i)
			{
				sum += list.get(i);
			}
			if(max < sum)
			{
				max = sum;
			}
			for(int i = 1; i + k - 1 < n; ++i)
			{
				sum -= list.get(i - 1);
				sum += list.get(i + k - 1);
				if(max < sum)
				{
					max = sum;
				}
			}
			System.out.println(max);
		}
	}
}