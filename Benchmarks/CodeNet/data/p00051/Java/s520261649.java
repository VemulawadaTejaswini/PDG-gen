import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		while(n-- != 0)
		{
			int num = stdIn.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			while(num != 0)
			{
				list.add(num % 10);
				num /= 10;
			}
			Collections.sort(list);
			int max = 0, min = 0;
			for(int i = list.size() - 1; i >= 0; --i)
			{
				max *= 10;
				max += list.get(i);
			}
			for(int i = 0; i < list.size(); ++i)
			{
				min *= 10;
				min += list.get(i);
			}
			System.out.println(max - min);
		}
	}
}