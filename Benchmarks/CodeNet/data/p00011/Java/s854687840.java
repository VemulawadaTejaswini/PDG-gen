import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int w = stdIn.nextInt();
		int n = stdIn.nextInt();
		List<Pair> list = new ArrayList<Pair>();
		for (int i = 0; i < n; i++) 
		{
			String str = stdIn.next();
			String[] arr = str.split(",");
			Pair p = new Pair();
			p.first = Integer.parseInt(arr[0]);
			p.second = Integer.parseInt(arr[1]);
			list.add(p);
		}
		List<Integer> pos = new ArrayList<Integer>();
		for(int i = 0; i < w; ++i)
		{
			pos.add(i + 1);
		}
		for(int i = 0; i < w; ++i)
		{
			int ans = i + 1;
			for(int j = 0; j < n; ++j)
			{
				if(list.get(j).first == ans)
				{
					ans = list.get(j).second;
				}
				else if(list.get(j).second == ans)
				{
					ans = list.get(j).first;
				}
			}
			pos.set(ans - 1, i + 1);
		}
		for(int i = 0; i < w; ++i)
		{
			System.out.println(pos.get(i));
		}
	}
}

class Pair
{
	int first;
	int second;
}