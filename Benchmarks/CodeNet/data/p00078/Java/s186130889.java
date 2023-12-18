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
			List<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
			for(int i = 0; i < n; ++i)
			{
				list.add(new ArrayList<Integer>());
				for(int j = 0; j < n; ++j)
				{
					list.get(i).add(0);
				}
			}
			int x = n / 2;
			int y = n / 2 + 1;
			int count = 1;
			list.get(y).set(x, count);
			int square = n * n;
			while(count < square)
			{
				++count;
				++x;
				++y;
				if(x >= n)
				{
					x = 0;
				}
				if(y >= n)
				{
					y = 0;
				}
				while(list.get(y).get(x) != 0)
				{
					--x;
					++y;
					if(x < 0)
					{
						x = n -1;
					}
					if(y >= n)
					{
						y = 0;
					}
				}
				list.get(y).set(x, count);
			}
			for(int i = 0; i < list.size(); ++i)
			{
				for(int j = 0; j < list.get(i).size(); ++j)
				{
					System.out.printf("%4d", list.get(i).get(j));
				}
				System.out.println("");
			}
		}
	}
}