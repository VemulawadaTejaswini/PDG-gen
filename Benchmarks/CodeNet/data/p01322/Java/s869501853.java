import java.util.*;
class P
{
	String str;
	int price;
	P(String str, int price)
	{
		this.str = str;
		this.price = price;
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
			int m = stdIn.nextInt();
			if(n == 0 && m == 0)
			{
				break;
			}
			List<P> lottery = new ArrayList<P>();
			for(int i = 0; i < n; ++i)
			{
				String str = stdIn.next();
				int price = stdIn.nextInt();
				lottery.add(new P(str, price));
			}
			int sum = 0;
			for(int i = 0; i < m; ++i)
			{
				String ticket = stdIn.next();
				for(int j = 0; j < n; ++j)
				{
					boolean flag = true;
					for(int k = 0; k < ticket.length(); ++k)
					{
						if(lottery.get(j).str.charAt(k) == '*')
						{
							continue;
						}	
						else if(ticket.charAt(k) != lottery.get(j).str.charAt(k))
						{
							flag = false;
							break;
						}
					}
					if(flag)
					{
						sum += lottery.get(j).price;
						break;
					}
				}
			}
			System.out.println(sum);
		}
	}
}