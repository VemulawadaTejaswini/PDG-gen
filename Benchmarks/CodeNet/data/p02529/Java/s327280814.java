import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i < n; ++i)
		{
			int a = stdIn.nextInt();
			set.add(a);
		}
		int count = 0;
		int q = stdIn.nextInt();
		for(int i = 0; i < q; ++i)
		{
			int a = stdIn.nextInt();
			if(set.contains(a))
			{
				++count;
			}
		}
		System.out.println(count);
	}
}