import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int n2 = n * 2;
		for(int i = 0; i < n2; ++i)
		{
			list.add(i + 1);
		}
		int m = stdIn.nextInt();
		for(int i = 0; i < m; ++i)
		{
			int k = stdIn.nextInt();
			if(k == 0)
			{
				List<Integer> listBuf = new ArrayList<Integer>();
				for(int j = 0; j < list.size(); ++j)
				{
					listBuf.add(list.get(j));
				}
				list.clear();
				for(int j = 0; j < n; ++j)
				{
					list.add(listBuf.get(j));
					list.add(listBuf.get(n + j));
				}
			}
			else
			{
				List<Integer> listBuf = new ArrayList<Integer>();
				for(int j = 0; j < list.size(); ++j)
				{
					listBuf.add(list.get(j));
				}
				list.clear();
				for(int j = k; j < n2; ++j)
				{
					list.add(listBuf.get(j));
				}
				for(int j = 0; j < k; ++j)
				{
					list.add(listBuf.get(j));
				}
			}
		}
		for(int i = 0; i < n2; ++i)
		{
			System.out.println(list.get(i));
		}
	}
}