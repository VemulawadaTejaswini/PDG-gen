import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				int t = stdIn.nextInt();
				list.add(t);
			}
			Collections.sort(list);
			int ans = 0;
			int sum = 0;
			for(int i = 0; i < n; ++i)
			{
				sum += list.get(i);
				ans += sum;
			}
			System.out.println(ans);
		}
	}
}