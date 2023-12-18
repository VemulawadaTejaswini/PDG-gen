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
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				int sum = 0;
				for(int j = 0; j < 5; ++j)
				{
					int a = stdIn.nextInt();
					sum += a;
				}
				list.add(sum);
			}
			Collections.sort(list);
			System.out.println(list.get(n - 1) + " " + list.get(0));
		}
	}
}