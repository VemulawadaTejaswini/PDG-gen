import java.util.*;
class P
{
	int a;
	int b;
	P(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int w = stdIn.nextInt();
		int n = stdIn.nextInt();
		List<P> list = new ArrayList<P>();
		for(int i = 0; i < n; ++i)
		{
			String[] str = stdIn.next().split(",");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			list.add(new P(a, b));
		}
		List<Integer> start = new ArrayList<Integer>();
		for(int i = 0; i < w; ++i)
		{
			start.add(i + 1);
		}
		List<Integer> end = new ArrayList<Integer>();
		for(int i = 0; i < w; ++i)
		{
			end.add(0);
		}
		for(int i = 0; i < w; ++i)
		{
			for(int j = 0; j < n; ++j)
			{
				if(start.get(i) == list.get(j).a)
				{
					start.set(i, list.get(j).b);
				}
				else if(start.get(i) == list.get(j).b)
				{
					start.set(i, list.get(j).a);
				}
			}
			end.set(start.get(i) - 1, i + 1);
		}
		for(int i = 0; i < w; ++i)
		{
			System.out.println(end.get(i));
		}
	}
}