import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String str = stdIn.next();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < str.length(); ++i)
			{
				if(str.charAt(i) == 'M')
				{
					list.add(1000);
				}
				else if(str.charAt(i) == 'D')
				{
					list.add(500);
				}
				else if(str.charAt(i) == 'C')
				{
					list.add(100);
				}
				else if(str.charAt(i) == 'L')
				{
					list.add(50);
				}
				else if(str.charAt(i) == 'X')
				{
					list.add(10);
				}
				else if(str.charAt(i) == 'V')
				{
					list.add(5);
				}
				else if(str.charAt(i) == 'I')
				{
					list.add(1);
				}
			}
			int sum = 0;
			boolean flag = false;
			for(int i = 0; i < list.size() - 1; ++i)
			{
				flag = false;
				if(list.get(i) < list.get(i + 1))
				{
					sum += list.get(i + 1) - list.get(i);
					++i;
					flag = true;
				}
				else
				{
					sum += list.get(i);
				}
			}
			if(!flag)
			{
				sum += list.get(list.size() - 1);
			}
			System.out.println(sum);
		}
	}
}