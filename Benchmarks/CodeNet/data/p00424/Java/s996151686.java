import java.util.*;

class P
{
	char first;
	char second;
	P(char first, char second)
	{
		this.first = first;
		this.second = second;
	}
}
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
			List<P> list = new ArrayList<P>();
			for(int i = 0; i < n; ++i)
			{
				char first = stdIn.next().charAt(0);
				char second = stdIn.next().charAt(0);
				list.add(new P(first, second));
			}
			int m = stdIn.nextInt();
			for(int i = 0; i < m; ++i)
			{
				char c = stdIn.next().charAt(0);
				boolean flag = false;
				for(int j = 0; j < list.size(); ++j)
				{
					if(list.get(j).first == c)
					{
						System.out.print(list.get(j).second);
						flag = true;
					}
				}
				if(!flag)
				{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}