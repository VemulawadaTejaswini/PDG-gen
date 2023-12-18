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
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				int price = stdIn.nextInt();
				list.add(price);
			}
			Collections.sort(list);
			int count = 1;
			int sum = 0;
			for(int i = list.size() - 1; i >= 0; --i)
			{
				if(count == m)
				{
					count = 1;
					continue;
				}
				sum += list.get(i);
				++count;
			}
			System.out.println(sum);
		}
	}
}