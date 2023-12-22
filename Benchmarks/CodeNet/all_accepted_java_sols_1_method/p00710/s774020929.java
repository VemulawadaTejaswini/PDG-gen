import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			int r = stdIn.nextInt();
			if(n == 0 && r == 0)
			{
				break;
			}
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				list.add(n - i);
			}
			while(r-- != 0)
			{
				int p = stdIn.nextInt();
				int c = stdIn.nextInt();
				List<Integer> listBuf = new ArrayList<Integer>();
				for(int i = 0; i < n; ++i)
				{
					listBuf.add(list.get(i));
				}
				int pos = 0;
				for(int i = p - 1; i < p + c - 1; ++i)
				{
					list.set(pos, listBuf.get(i));
					++pos;
				}
				for(int i = 0; i < p - 1; ++i)
				{
					list.set(pos, listBuf.get(i));
					++pos;
				}
				for(int i = p + c - 1; i < n; ++i)
				{
					list.set(pos, listBuf.get(i));
					++pos;
				}
			}
			System.out.println(list.get(0));
		}
	}
}