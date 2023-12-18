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
			List<Integer> num = new ArrayList<Integer>();
			for(int i = 0; i < 7; ++i)
			{
				num.add(0);
			}
			for(int i = 0; i < n; ++i)
			{
				int a = stdIn.nextInt();
				if(a < 10)
				{
					num.set(0, num.get(0) + 1);
				}
				else if(a < 20)
				{
					num.set(1, num.get(1) + 1);
				}
				else if(a < 30)
				{
					num.set(2, num.get(2) + 1);
				}
				else if(a < 40)
				{
					num.set(3, num.get(3) + 1);
				}
				else if(a < 50)
				{
					num.set(4, num.get(4) + 1);
				}
				else if(a < 60)
				{
					num.set(5, num.get(5) + 1);
				}
				else
				{
					num.set(6, num.get(6) + 1);
				}
			}
			for(int i = 0; i < 7; ++i)
			{
				System.out.println(num.get(i));
			}
		}
	}
}