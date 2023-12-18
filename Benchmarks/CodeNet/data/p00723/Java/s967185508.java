import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int m = stdIn.nextInt();
		while(m-- != 0)
		{
			String str = stdIn.next();
			int size = str.length();
			Set<String> set = new HashSet<String>();
			for(int i = 1; i < size; ++i)
			{
				String first = "";
				String second = "";
				for(int j = 0; j < i; ++j)
				{
					first += str.charAt(j);
				}
				for(int j = i; j < size; ++j)
				{
					second += str.charAt(j);
				}
				StringBuilder revFirst = new StringBuilder(first);
				StringBuilder revSecond = new StringBuilder(second);
				revFirst.reverse();
				revSecond.reverse();
				set.add(first + second);
				set.add(first + revSecond.toString());
				set.add(revFirst.toString() + second);
				set.add(revFirst.toString() + revSecond.toString());
				set.add(second + first);
				set.add(second + revFirst.toString());
				set.add(revSecond.toString() + first);
				set.add(revSecond.toString() + revFirst.toString());
			}
			System.out.println(set.size());
		}
	}
}